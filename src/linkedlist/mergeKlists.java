package src.linkedlist;

import java.util.PriorityQueue;

public class mergeKlists {
    static class ListNode{
        int val;
        ListNode next;
        ListNode(){

        }
        ListNode(int val){
            this.val=val;
        }
    }
    public ListNode mergeKLists(ListNode[] lists) {
        PriorityQueue<Integer> queue=new PriorityQueue<>();
        for(int i=0;i<lists.length;i++){
            ListNode curr=lists[i];
            while(curr!=null){
                queue.add(curr.val);
                curr=curr.next;
            }
        }
        ListNode dummy=new ListNode();
        ListNode temp=dummy;
        while(queue.size()>0){
            temp.next=new ListNode(queue.remove());
            temp=temp.next;
        }
        return dummy.next;
    }
}
