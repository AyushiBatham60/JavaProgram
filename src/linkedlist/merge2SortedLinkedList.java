package src.linkedlist;

public class merge2SortedLinkedList {

    class ListNode{
        int val;
        ListNode next;
        ListNode(){

        }
        ListNode(int val){
            this.val=val;
        }
    }
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode n1=list1;
        ListNode n2=list2;
        ListNode dummy=new ListNode();
        ListNode ans=new ListNode();
        dummy=ans;
        while( n1!=null && n2!=null){
            if(n1.val<=n2.val){
                ans.next=n1;
                n1=n1.next;
            }
            else{
                ans.next=n2;
                n2=n2.next;
            }
            ans=ans.next;
        }
        if(n1!=null){
            ans.next=n1;
        }
        if(n2!=null){
            ans.next=n2;
        }
        return dummy.next;
    }
}
