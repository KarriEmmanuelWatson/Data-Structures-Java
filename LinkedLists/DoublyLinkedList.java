class Node {
    int data ;
    Node  prev;
    Node  next;
    Node(int data){
        this.data = data;
        this.prev = null;
        this.next = null;
    }
}
class DoubleLinkedList {
    private Node head = null;
    private Node tail = null;

    void insertFront(int data){
        Node newNode = new Node(data);
        if(head == null) {
            head = newNode;
            tail = newNode;
            return;

        }
        newNode.next = head;
        head.prev = newNode;
        head = newNode;
    }
    
    void insertRear(int data){
        Node newNode =new Node(data);

        if(head == null){
            head  = newNode;
            tail = newNode;
            return;
        }
        tail.next = newNode;
        newNode.prev = tail;
        tail = newNode;
    }
    
    void  printForward(){
        Node temp = head;
        if(head == null) {
            System.out.println("No list exitss???");
            return;
        }
        while (temp != null){
            System.out.print(temp.data + " -->");
            temp = temp.next;
        }
        System.out.println();
    }

    void printBackward(){
        if(head == null) {
            System.out.println("NO list Exists???");
            return; 
        }
        Node temp = tail;
        while (temp != null){
            System.out.print(temp.data + "-->");
            temp = temp.prev;
        }
        System.out.println();
    }

    void deleteFront(){
        if(head == null){
            System.out.println("Empty List");
            return ;
        }
        head = head.next;
        head.prev = null;
    }
    
    void deleteRear(){
        if(head == null){
            System.out.println("Empty List");
            return;
        }
        tail = tail.prev;
        tail.next = null;
    }
}
