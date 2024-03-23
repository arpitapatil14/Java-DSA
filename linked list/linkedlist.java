class Node {
    int data;
    Node next;
  
    public Node(int data) {
      this.data = data;
      this.next = null;
    }
  }
  
  public class linkedlist {
    public Node head;
    public Node tail;
    public int size;
  
    public void addFirst(int data) {
      Node newNode = new Node(data);
      size++;
      if (head == null) {
        head = tail = newNode;
      } else {
        newNode.next = head;
        head = newNode;
      }
    }
  
    public void addLast(int data) {
      Node newNode = new Node(data);
      size++;
      if (head == null) {
        head = tail = newNode;
      } else {
        tail.next = newNode;
        tail = newNode;
      }
    }
  
    public void addmid(int idx, int data) {
      Node newNode = new Node(data);
      size++;
      Node temp = head;
      int i = 0;
        if(idx==0){
            addFirst(data);
            return;
        }
  
      while (i < idx - 1) {
        temp = temp.next;
        i++;
      }
      newNode.next = temp.next;
      temp.next = newNode;
  
    }
  
    public void printLinkedList() {
      if (head == null) {
        System.out.println("ll is empty");
        return;
      }
      Node current = head;
      while (current != null) {
        System.out.print(current.data + "->");
        current = current.next;
      }
      if(current == null){
        System.out.print("->null"); // Printing "null" after the last node
      }
      System.out.println();
    }
  
    public static void main(String[] args) {
      linkedlist ll = new linkedlist();
      ll.printLinkedList();
      ll.addFirst(1);
      ll.printLinkedList();
      ll.addFirst(2);
      ll.printLinkedList();
  
      ll.addFirst(3);
      ll.printLinkedList();
  
      ll.addFirst(4);
      ll.printLinkedList();
  
      ll.addLast(10);
      ll.printLinkedList();
      ll.addmid(3, 69);
  
      ll.addLast(11);
      ll.printLinkedList();
  
      ll.addLast(12);
      ll.printLinkedList();
      System.out.println(ll.size);
    }
  }
  