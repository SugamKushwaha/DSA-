public class LinkedLists {

    int data;
    LinkedLists next;

    public LinkedLists(int data) {
        this.data = data;
        this.next = null;
    }
    
    public static void main(String[] args) {
        
        LinkedLists head = new LinkedLists(2);
        head.next = new LinkedLists(3);
        head.next.next = new LinkedLists(5);
        head.next.next.next = new LinkedLists(7);

        LinkedLists temp = head;
        while(temp != null){
            System.out.print(temp.data + "-> ");
            temp = temp.next;
        }
         System.out.print("null");
    }
}
