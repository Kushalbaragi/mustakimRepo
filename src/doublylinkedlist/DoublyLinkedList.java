package doublylinkedlist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;

class DoublyLinkedList {
    class Node{
        int data;
        Node previous;
        Node next;

        public Node(int data) {
            this.data = data;
        }
    }

    Node head,tail=null;

    public void addNode(int data){
        Node newNode=new Node(data);

        if (head==null){
            head=tail=newNode;
            head.previous=null;
            tail.next=null;
        }
        else {
            tail.next=newNode;
            newNode.previous=tail;
            tail=newNode;
            tail.next=null;
        }
    }

    public int countNodes(){
        int count=0;
        Node currrnt=head;
        while (currrnt!=null){
            count++;
            currrnt=currrnt.next;
        }
        return  count;
    }

    public void display(){
        Node current=head;
        if(head==null){
            System.out.println("List is empty..!");
            return;
        }
        System.out.println("Nodes of doubly linked list...!");
        while(current!=null){
            System.out.println(current.data+" ");
            current=current.next;
        }
    }

    public static void main(String[] args) {
        DoublyLinkedList dll=new DoublyLinkedList();
        dll.addNode(1);
        dll.addNode(2);
        dll.addNode(3);
        dll.addNode(4);
        dll.addNode(5);
//        dll.addNode(6);

        dll.display();
        System.out.println("Total count of nodes : "+dll.countNodes());

        LinkedList ll=new LinkedList();

        ArrayList al= new ArrayList();
        Collections.unmodifiableCollection(al);
        al.add("Mu");
        System.out.println(al);

    }
}
