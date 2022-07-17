import java.util.*;
public class Read
{
	public static void main(String[] args) {
	    int num;
        String s;
        char ch;
		Scanner input=new Scanner(System.in); // Creating the Scanner object
		System.out.print("Enter a number : ");
		num=input.nextInt();
		System.out.println("You entered the number : "+num);
        
        System.out.print("Enter a string : ");
        s=input.nextLine().trim();
        System.out.println("You entered the string : "+s);

        System.out.print("Enter a character : ");
        ch=input.nextLine().trim().charAt(0);
        System.out.println("You entered the char : "+ch);

        input.close();
	}
}
