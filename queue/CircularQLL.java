public class CircularQLL{
    Node front;
    Node rear;

    public boolean isEmpty(){
        if(front==null&&rear==null){
            return true;
        }
        return false;
    }

    public void enqueue(int val){
        Node newNode=new Node(val);
        if(isEmpty()){
            front=newNode;
        }
        else{
            rear.next=newNode;
        }
        rear=newNode;
        rear.next=front;
    }

    public void dequeue(){
        if(isEmpty()){
            System.out.println("Queue is empty");
            return;
        }
        else if(front==rear){//single element
            System.out.print(" " + rear.val);
            front=null;
            rear=null;
        }
        System.out.println(front.val);
        front=front.next;
        rear.next=front;
    }

    public void front(){
        if(isEmpty()){
            System.out.println("Queue is empty");
        }
        else{
            System.out.println(front.val);
        }
    }

    public void rear(){
        if(isEmpty()){
            System.out.println("Queue is empty");
        }
        else{
            System.out.println(rear.val);
        }
    }

    public void display(){
        if(isEmpty()){
            System.out.println("Queue is empty");
        }
        else if(front==rear){
            System.out.print(" " + rear.val);
        }
        else{
            Node temp=front;
            while(temp!=rear){
                System.out.print(temp.val + " -> ");
                temp=temp.next;
            }
            System.out.print(rear.val);
        }
    }

    public static void main(String[] args) {
        CircularQLL queue = new CircularQLL();
        queue.enqueue(14);
        queue.enqueue(22);
        queue.enqueue(6);
        queue.display();
        System.out.println();
        queue.dequeue();
        queue.dequeue();
        queue.display();
        System.out.println();
        queue.enqueue(9);
        queue.enqueue(20);
        queue.display();
    }

    class Node{
        int val;
        Node next;
        Node(int val){
            this.val=val;
        }
    }
}