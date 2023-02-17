package src.linkedlist;

public class hasCycle {
    ListNode head;

    static  class ListNode{
        int val;
        ListNode next;
        ListNode(){

        }
        ListNode(int val){
            this.val=val;
        }
    }

    public boolean hasCycle(ListNode head) {
        ListNode slow=head;
        ListNode fast=head;
        while(fast!=null && fast.next!=null){
            if(slow.next==fast.next.next){
                return true;
            }
            slow=slow.next;
            fast=fast.next.next;
        }
        return false;
    }


    public static void main(String[] args) {

    }
}
