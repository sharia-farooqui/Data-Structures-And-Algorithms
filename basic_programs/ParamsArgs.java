import java.util.Scanner;

public class ParamsArgs {
    public static void main(String[] args) {
        String name;
        Scanner input=new Scanner(System.in);
        System.out.println("Enter your name: ");
        name=input.next();
        greet(name); 
        input.close();
    }

    static void greet(String a){
        System.out.println("Hello there " +a);
    }
}