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
    boolean found = false;
    int target = sc.nextInt();
    while(current != null){
      if(current.data == target){ found = true; break;}
      current = current.next;
    }
    if(found) System.out.print("Element found");
    else System.out.print("Element not found");
  }
}
