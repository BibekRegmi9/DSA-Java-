package linkedlist;

public class LinkedListImpl {

    public int data;
    public LinkedListImpl next;

    public LinkedListImpl(int data){
        this.data = data;
        this.next = null;
    }

    public static void main(String[] args) {
        LinkedListImpl node1 = new LinkedListImpl(10);
        System.out.println(node1.data);
        System.out.println(node1.next);

        LinkedListImpl node2 = new LinkedListImpl(1000);
        node1.next = node2;
        System.out.println(node1.next.data);
    }
}
