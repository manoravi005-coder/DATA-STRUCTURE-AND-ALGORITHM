import java.util.*;
class Node{
  int data;
  Node next;
  Node(int data){
    this.data = data;
    this.next = null;
  }
}
public class Main{
  public static Node insertbegin(Node head, int value){
    Node newnode = new Node(value);
    newnode.next = head;
    head = newnode;
    return head;
  } 
  public static void printlist(Node head){
    Node current = head;
      while(current != null){
      System.out.print(current.data + " ");
      current = current.next;
    }
    System.out.println();
  }
  public static void  main (String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    Node head = null; Node tail = null;
    for(int i = 0; i<n; i++){
      int val = sc.nextInt();
      Node newnode = new Node(val);
      if(head == null){
        head = newnode;
        tail = newnode;
      }
      else{
        tail.next = newnode;
        tail = newnode;
      }
    
  }
  int value = sc.nextInt();
    head = insertbegin(head, value);
    printlist(head);
  }
}
