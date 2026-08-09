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
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    Node head = null;
    Node tail = null;
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
    int Max = Integer.MIN_VALUE;
    Node current = head;
    while(current != null){
      if(current.data>Max){
        Max = current.data;
      }current = current.next;
    }
    System.out.print(Max);
  }
}
