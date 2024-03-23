class Node{
    int data;
    Node next;
    public Node(int data){
        this.data=data;
        this.next=null;

    }
}
public class iterativesearch {
    public Node head;
    public Node tail;
    public int size;

    public void addfirst(int data){
        Node newNode = new Node(data);
        if(head== null){
            head=tail=newNode;
            return;
        }else{
            newNode.next=head;
            head= newNode;
        }

    }
    public void print(){
        Node curr= head;
        while(curr!= null){
            System.out.print(curr.data + "->");
            curr=curr.next;
        }
        if(curr == null){
            System.out.print("null");
        }
        System.out.println("");
    }
    public int iterativesearch(int key){
        Node temp= head;
        int i=0;
        while(temp!=null){
            if(temp.data == key){
                return i;
            }
            temp =temp.next;
            i++;
        }
        return -1;
    }
    public static void main(String[] args){
        iterativesearch ll= new iterativesearch();
        ll.addfirst(5);
        ll.addfirst(4);
        ll.addfirst(3);
        ll.addfirst(2);
        ll.addfirst(1);
        ll.print();
        System.out.println(ll.iterativesearch(3));
        System.out.println(ll.iterativesearch(10));

    }
    
}
