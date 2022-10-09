public class QueueA {
    int[] queue;
    int rear;
    int front;
    int size;

    QueueA(int k){
        queue=new int[k];
        rear=-1;
        front=-1;
        size=k;
    }

    public void enqueue(int val){
        if(isFull()){
            System.out.println("Queue is full");
        }
        else{
            if(isEmpty()){
                front+=1;
            }
            rear+=1;
            queue[rear]=val;
        }
    }

    public void dequeue(){
        if(isEmpty()){
            System.out.println("Queue is empty");
        }
        else{
            System.out.println(queue[front]);
            front+=1;
        }
    }

    public boolean isEmpty(){
        if((front==-1&&rear==-1)||front>rear){
            return true;
        }
        return false;
    }

    public boolean isFull(){
        if(rear==size-1){
            return true;
        }
        return false;
    }

    public void front(){
        if(isEmpty()){
            System.out.println("Queue is empty");
        }
        else{
            System.out.println(queue[front]);
        }
    }

    public void rear(){
        if(isEmpty()){
            System.out.println("Queue is empty");
        }
        else{
            System.out.println(queue[rear]);
        }
    }

    public void display(){
        if(isEmpty()){
            System.out.println("Queue is empty");
        }
        else{
            for(int i=front;i<=rear;i++){
                System.out.print(" " +queue[i]);
            }
        }
    }

    public static void main(String[] args) {
        QueueA queue = new QueueA(5);     
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.enqueue(40);
        queue.enqueue(50);
        queue.front();
        queue.rear();
        queue.dequeue();
        queue.dequeue();
        queue.dequeue();
        queue.dequeue();
        queue.dequeue();
        queue.enqueue(59);
        queue.display();   
    }
}
