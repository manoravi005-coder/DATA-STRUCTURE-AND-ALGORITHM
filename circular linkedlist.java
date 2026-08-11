import java.util.*;
class Circularlinkedlist{
  class Node{
    int data;
    Node next;
    Node(int data){
      this.data = data;
      this.next = null;
    }
  }
  Node head = null;
  void insert(int val){
    Node newnode = new Node(val);
    if(head == null){
      head = newnode;
      newnode.next = head; return;
    }
    Node current = head;
    while(current.next!=head){
      current = current.next;
    }
    current.next = newnode;
    newnode.next = head;
  }
  void display(){
    if(head == null) return;
    Node current = head;
    do{
      System.out.print(current.data + " ");
      current = current.next;
    }while(current != head);
  }
}
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    Circularlinkedlist list = new Circularlinkedlist();
    int n = sc.nextInt();
    for(int i =0; i<n; i++){
      int value = sc.nextInt();
      list.insert(value);
    }
    list.display(); sc.close();
  }
}
