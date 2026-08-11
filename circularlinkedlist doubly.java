import java.util.*;
class Circular{
  class Node{
    int data;
    Node next;
    Node prev;
    Node(int data){
      this.data=data;
      this.next=null;
      this.prev=null;
    }
  } 

  Node head=null;
  void insertfirst(int data){
    Node newnode= new Node(data);
    if(head==null){
      head=newnode;
      newnode.next=head;
      newnode.prev=head;
      return;
    }

    Node last=head.prev;
    newnode.next=head;
    newnode.prev=last;
    head.prev=newnode;
    last.next=newnode;
    head=newnode;
  }

  void display(){
    if(head==null) return;
    Node temp=head;
    do{
      System.out.print(temp.data+" ");
      temp=temp.next;
    }while(temp!=head);
  }
}

public class Main {
    public static void main(String[] args) {
      Circular dll= new Circular();
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      for(int i=0;i<n;i++)
       dll.insertfirst(sc.nextInt());
      dll.display();
      sc.close();
    }
}
