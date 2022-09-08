public class CircularQArray{
    static int[] cqueue;
    static int front; 
    static int rear;
    static int size;

    CircularQArray(int k){
        cqueue=new int[k];
        front=-1;
        rear=-1;
        size=k;
    }

    public void front() {
        if(isEmpty()){
            System.out.println(-1);
        }
        else{
            System.out.println(cqueue[front]);
        }
    }

    public void rear(){
        if(isEmpty()){
            System.out.println(-1);
        }
        else{
            System.out.println(cqueue[rear]);
        }
    }

    public void dequeue(){
        if(isEmpty()){
            System.out.println("Queue is empty");
        }
        else{
            System.out.println("Dequeued : " + cqueue[front]);
            if(front==rear){//single element
                front=-1;
                rear=-1;
            }
            else{
                front=(front+1)%size;
            }
        }
    }

    public void enqueue(int val){
        if(isFull()){
            System.out.println("Queue is full");
        }
        else{
            if(front==-1){ //queue is empty
                front+=1;
            }
            rear=(rear+1)%size;
            cqueue[rear]=val;
        }
    }

    public boolean isEmpty(){
        if(front==-1&&rear==-1){
            return true;
        }
        return false;
    }

    public boolean isFull(){
        if((rear+1)%size==front){
            return true;
        }
        return false;
    }

    public void display(){
        if(isEmpty()){
            System.out.println("Queue is empty");
            return;
        }
        int i=front;
        if(front<rear){
            while(i<=rear){  
                System.out.print(" " + cqueue[i]);
                i+=1;  
            }
        }
        else{
            while(i!=rear){ 
                System.out.print(" " + cqueue[i]); 
                i=(i+1)%size;  
            }
            System.out.print(" " + cqueue[i]);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        CircularQArray queue = new CircularQArray(5);
        System.out.println(queue.isEmpty());
        queue.enqueue(23);
        queue.enqueue(27);
        queue.enqueue(523);
        queue.enqueue(43);
        queue.enqueue(91);
        System.out.println(queue.isEmpty());
        System.out.println(queue.isFull());
        queue.dequeue();
        queue.dequeue();
        System.out.println(queue.isEmpty());
        System.out.println(queue.isFull());
        queue.display();
        queue.enqueue(24);
        System.out.println(queue.isEmpty());
        System.out.println(queue.isFull());
        queue.display();
    }

}