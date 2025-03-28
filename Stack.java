class Node{
    int data;
    Node next ;

    Node(int data){
        this.data = data;
        this.next = null;
    }
}

class stackList {
    private Node top;
    
    public boolean isEmpty(){
        return top == null ;
    }

    void  push(int data){
        Node newNode = new Node(data);
        newNode.next = top;
        top = newNode;
    }

    void pop(){
        if(isEmpty()){
            System.out.println("Stack underFlow !!!");
        }
        Node temp = top;
        top = top.next;
        temp = null;
    }

    void peek(){
        if(isEmpty()) 
           System.out.println("Nothing to Peek in Stack !!!!");
        System.out.println(top.data);
    }

    public void printStack(){
        if(isEmpty()) {
            System.out.println("Stack is Empty !!"); 
        }
        else {
            Node temp = top;
            while (temp != null ){
                System.out.print(temp.data + "--->");
                temp = temp.next;
            }
            System.out.println();
        }
    }
}

public  class Stack {
    public static void main(String[] args) {
        stackList newStack = new stackList();
        newStack.push(10);
        newStack.push(20);
        newStack.push(30);
        newStack.printStack();
        newStack.pop();
        newStack.printStack();
        newStack.peek();
    }
}
