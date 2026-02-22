public class Node {
    
     int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }

    public static void main(String[] args) {
        
       Node head = new Node(1);          // first node
        head.next = new Node(4);          // second node
        head.next.next = new Node(3);     // third node
        head.next.next.next = new Node(0);// fourth node
        head.next.next.next.next = new Node(2); // fifth node

        

        // Print list
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.print("null");
    }
}
