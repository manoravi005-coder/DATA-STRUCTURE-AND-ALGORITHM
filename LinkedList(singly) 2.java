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
    for(int i =0; i<n; i++){
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
    Node current = head;
    int count = 0;
    while(current != null){
      count++;
      current = current.next;
    }
    System.out.print(count);
  }
}
