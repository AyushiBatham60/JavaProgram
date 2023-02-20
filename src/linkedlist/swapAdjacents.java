package src.linkedlist;

public class swapAdjacents {
    static class ListNode{
        int val;
        ListNode next;
        ListNode(){

        }
        ListNode(int val){
            this.val=val;
        }
    }

    public ListNode swapPairs(ListNode head) {
        ListNode first=head;
        ListNode second=head==null?null:head.next;
        while(first!=null && second!=null ){
            int temp=first.val;
            first.val=second.val;
            second.val=temp;
            first=second.next;
            second=second.next==null?null:second.next.next;
        }
        return head;
    }
}
