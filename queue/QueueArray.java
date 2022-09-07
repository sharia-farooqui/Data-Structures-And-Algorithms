import java.util.Arrays;

public class QueueArray
{
    static int[] queue=new int[5];
	static int rear=-1, front=-1;
    
	public static void main(String[] args) {
		enqueue(10);
		enqueue(20);
		dequeue();
		enqueue(40);
		peek();
		enqueue(43);
		dequeue();
		enqueue(87);
		display();
		isFull();
		isEmpty();
		dequeue();
		dequeue();
		dequeue();
		display();
		isEmpty();
		System.out.println(Arrays.toString(queue));
		enqueue(89);
		isEmpty(); //bcz front>rear
	}
	
	public static void display(){
	    if((front==-1&&rear==-1)){
	        System.out.println("Queue is empty"); 
	        return;
	    }
	    for(int i=front;i<=rear;i++){
		    System.out.print(" " + queue[i]);
		}
		System.out.println();
	}
	
	public static void isFull(){
	    if(rear==queue.length-1){
	        System.out.println("true");
	        return;
	    }
	    System.out.println("false");
	    return;
	}
	
	public static void isEmpty(){
	    if((front==-1&&rear==-1)){
	        System.out.println("true");
	        return;
	    }
	    System.out.println("false");
	    return;
	}
	
	public static void enqueue(int val){
		if(rear==queue.length-1||front>rear){ //if overflow
			System.out.println("Queue is full");
		}
		else if(rear==-1&&front==-1){ //if queue empty
		    rear+=1;
			queue[rear]=val;
			front+=1;
		}
		else{
			rear+=1;
			queue[rear]=val;
		}
	}
	
	public static void dequeue(){
	    if(front==-1&&rear==-1){//queue empty
	        System.out.println(-1);
	    }
	    else if(front==rear){//only 1 element exists in the queue
	        int el=queue[front];
			queue[front]=0;
	        // rear=-1;
	        // front=-1;
			front+=1;
	        System.out.println("Dequeued : " + el);
	    }
	    else{
	        int el=queue[front];
			queue[front]=0;
	        front+=1;
	        System.out.println("Dequeued : " + el);
	    }
	}
	
	public static void peek(){
		if((front==-1&&rear==-1)){
	        System.out.println("Queue is empty");
	    }
		else{
			System.out.println("Peek : " + queue[front]);
		}
	}	
}