class Node {
    int data;
    Node next;
  
    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class removeinll {
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

    public int removeFirst() {
        if (head == null) {
            System.out.println("LinkedList is empty. Cannot remove.");
            return -1; // Return a default value indicating failure
        }
        int val = head.data;
        if (head == tail) {
            head = tail = null;
        } else {
            head = head.next;
        }
        size--;
        return val;
    }

    public int removeLast(){
        if(size==0){
            System.out.println("LL is empty");
            return Integer.MIN_VALUE;
        }else if(size==1){
            int val = tail.data;
            head=tail=null;
            size=0;
            return val;
        }
        Node prev= head;
        for(int i=0;i<size-2;i++){
            prev=prev.next;
        }
        int val= prev.next.data;
        prev.next=null;
        tail=prev;
        size--;
        return val;
    }

    public void print() {
        if (head == null) {
            System.out.println("LinkedList is empty");
            return;
        }
        Node current = head;
        while (current != null) {
            System.out.print(current.data + "->");
            current = current.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        removeinll ll = new removeinll();
        ll.addFirst(1);
        ll.addFirst(2);
        ll.addLast(3);
        ll.addLast(4);
        ll.addLast(5);
        ll.removeFirst();
        ll.print();
        ll.removeLast();
        ll.print();
    }
}
