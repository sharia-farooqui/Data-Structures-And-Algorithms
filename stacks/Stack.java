import java.util.*;

public class Stack{

    public static class MyStack{
        int[] stack;
        int top;

        public MyStack(int capacity) {
            stack = new int[capacity];
            this.top = -1;
        }

        int size(){
            int cnt=0;
            for(int i=top;i>=0;i--){
                cnt+=1;
            }
            return cnt;
        }

        void push(int data){
            if(top==stack.length-1){
                System.out.println("Stack overflow");
            }
            else{
                top++;
                stack[top]=data;
            }
        }

        int pop(){
            if(top==-1){
                System.out.println("Stack underflow");
                return -1;
            }
            else{
                int data=stack[top];
                stack[top]=0;
                top--;
                return data;
            }
        }

        int peek(){
            if(top==-1){
                System.out.println("Stack underflow");
                return -1;
            }
            return stack[top];
        }

        void display(){
            if(top<0){
                System.out.println("Stack is empty");
                return;
            }
            else{
                for(int i=top;i>=0;i--){
                    System.out.println(stack[i] + " ");
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int capacity = scn.nextInt();
        MyStack st = new MyStack(capacity);
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);
        System.out.println();
        st.display();
        System.out.println();
        System.out.println(st.peek());
        st.pop();
        System.out.println();
        st.display();
        System.out.println();
        System.out.println(st.size());
        System.out.println();
        st.push(60);
        st.display();
        System.out.println();
        st.push(70);
        st.display();
        System.out.println();
        st.push(80);
        st.display();
        System.out.println();
        scn.close();
    }
}