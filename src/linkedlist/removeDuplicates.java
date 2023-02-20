package src.linkedlist;

public class removeDuplicates {
    static class ListNode{
        int val;
        ListNode next;
        ListNode(){

        }
        ListNode(int val){
            this.val=val;
        }
    }
    public ListNode deleteDuplicates(ListNode head) {
        ListNode curr=head;
        while(curr!=null){
            ListNode nextNode=curr;
            while(nextNode!=null && nextNode.val==curr.val){
                nextNode=nextNode.next;
            }
            curr.next=nextNode;
            curr=curr.next;
        }
        return head;
    }
}
