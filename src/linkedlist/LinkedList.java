package src.linkedlist;

public class LinkedList {
    static class Node{
        int data;
        Node next;
        Node(int d){
            data=d;
        }
    }
    Node head;
    public static LinkedList insert(LinkedList list,int data){
        Node n=new Node(data);
        if(list.head==null){
            list.head=n;
        }
        else {
            Node cur=list.head;
            while (cur.next!=null){
                cur=cur.next;
            }
            cur.next=n;
        }
        return list;
    }
    public static void print(LinkedList list){
        Node cur=list.head;
        while (cur!=null){
            System.out.print(cur.data+"->");
            cur=cur.next;
        }
        System.out.print("null");
    }
    public static LinkedList delete(LinkedList list,int data){


        Node cur=list.head;

        if(cur.data==data){

            list.head=cur.next;
            return list;
        }
        Node prev=null;

        while (cur!=null && cur.data!=data){

            prev=cur;
            cur=cur.next;
        }
        if(cur!=null) {
            prev.next = cur.next;
        }

        return list;
    }
    public static void main(String[] args) {
        LinkedList l1=new LinkedList();
        l1=insert(l1,10);
        l1=insert(l1,20);
        l1=insert(l1,30);
        l1=insert(l1,40);
        l1=delete(l1,50);
        print(l1);
    }
}
