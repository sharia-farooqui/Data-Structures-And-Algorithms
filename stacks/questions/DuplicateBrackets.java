import java.io.*;
import java.util.*;

public class DuplicateBrackets{

   public static void main(String[] args) throws Exception {
      Scanner scn = new Scanner(System.in);
      String str=scn.nextLine();

      Stack<Character> st = new Stack<>();
      for(int i=0;i<str.length();i++){
         char ch = str.charAt(i);
         if(ch=='('||ch=='+'||ch=='-'||ch=='*'||ch=='/'){
            st.push(ch);
         }
         else if(ch==')'){
            if(st.peek()=='('){
               System.out.println(true);
               return;
            }
            else{
               while(st.peek()!='('){
                  st.pop();
               }
               st.pop();
            }
         }
      }
      System.out.println(false);
   }

}