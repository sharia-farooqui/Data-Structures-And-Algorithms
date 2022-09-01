class StackLL{
    StackNode top; //top behaves like head
    int size;
    class StackNode{
        int val;
        StackNode next;
        StackNode(int val){
            this.val=val;
        }
    }

    public void push(int val){
        StackNode newNode = new StackNode(val);
        if(top==null){
            top=newNode;
        }
        else{
            newNode.next=top;
            top=newNode;
        }
        size+=1;
    }

    public int pop(){
        StackNode popped = top;
        top=top.next;
        size-=1;
        return popped.val;
    }

    public int peek(){
        if(top==null){
            System.out.println("Stack empty");
        }
        return top.val;
    }

    public void display(){
        if(top==null){
            System.out.println("Stack empty");
        }
        StackNode temp = top;
        while(temp!=null){
            System.out.println(temp.val + " ");
            temp=temp.next;
        }
    }

    public int size(){
        // if(top==null){
        //     System.out.println("Stack empty");
        // }
        // StackNode temp = top;
        // int count=1;
        // while(temp.next!=null){
        //     count+=1;
        //     temp=temp.next;
        // }
        // return count;
        return size;
    }

    public static void main(String[] args) {
        StackLL stack = new StackLL();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.display();
        System.out.println(stack.pop());
        System.out.println(stack.peek());
        stack.push(40);
        stack.push(87);
        stack.display();
        stack.push(54);
        stack.push(47);
        stack.pop();
        stack.display();
        System.out.println(stack.size());
    }
}