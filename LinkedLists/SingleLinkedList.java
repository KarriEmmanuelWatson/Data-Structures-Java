
class  Node {
    int data ;
    Node next;
    Node(int data){
        this.data = data;
        this.next = null;
    }
}

class SingleLinkedList {
    private  Node head = null;

    void insertBegin(int ele){
        Node newNode = new Node(ele);

        if(head == null) {
            head = newNode;
            return ;
        }
        newNode.next = head;
        head = newNode;
    }

    void insertEnd(int ele){
        Node newNode = new Node(ele);
        if(head == null) {
            head = newNode;
            return ;
        }
        Node temp = head;
        while (temp.next != null){
            temp = temp.next;
        }
        temp.next = newNode;
    }

    void printList(){
        if (head == null ) {
            System.out.println("Empty list ");
            return ;
        }
        
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + "-->");
            temp = temp.next;
        }
        System.out.println();
    }

    void deleteBegin(){
        if(head == null){
             System.out.println("Linked List is Empty !!!");
             return ;
        }
        head = head.next;
    }

    void deleteEnd(){
        if(head == null ) {
            System.out.println("Empty Linked List!!");
        }
        else if(head.next != null) head = null;
        
        else {
            Node temp = head ;
            while (temp.next.next != null)
              temp  = temp.next;
            temp.next = null;
        }
    }
    
}
