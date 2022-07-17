
import java.util.Scanner;

public class LinearSearchString {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        String[] str=new String[5];
        System.out.println("Enter elements : ");
        for(int i=0;i<str.length;i++){
            str[i]=input.next();
        }
        System.out.println("Enter value to search: ");
        String search=input.next();

        for(int i=0;i<str.length;i++){
            if(str[i].equals(search)){
                System.out.println(search + " found at index "+ i);
            }
        }
        input.close();
    }
}