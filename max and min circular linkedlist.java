import java.util.*;
class Circular{
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
      head = newnode; head.next = head; return;
    }
    Node current = head;
    while(current.next != head){
      current = current.next;
    }
    current.next = newnode;
    newnode.next = head;
  }
  int findmin(){
    if(head == null) return Integer.MAX_VALUE;
    int min = head.data;
    Node current = head.next;
    while(current != head){
      if(current.data < min){
        min = current.data;
      }
      current = current.next;
    }
    return min;
  }
  int findmax(){
    if(head == null) return Integer.MIN_VALUE;
    int max = head.data;
    Node current = head.next;
    while(current != head){
      if(max < current.data){
        max = current.data;
      }
      current = current.next;
    }
    return max;
  }
}
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    Circular list = new Circular();
    int n = sc.nextInt();
    for(int i = 0; i<n; i++){
      list.insert(sc.nextInt());
    }
    System.out.println("Minimum "+ list.findmin());
    System.out.println("Maximum " + list.findmax());
    sc.close();
  }
}
