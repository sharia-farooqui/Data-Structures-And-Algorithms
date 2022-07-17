import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int[][] arr=new int[3][3];

        //input array
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.print("Enter element " + i + j + ":");
                arr[i][j]=input.nextInt();
            }
        }

        //display array
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                    System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        //input target
        System.out.print("Enter element to search: ");
        int target=input.nextInt();

        //function call
        int result = search(arr, target);

        if(result==-1){
            System.out.println("Element not found");
        }

        input.close();
    }

    private static int search(int[][] arr, int target){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                if(arr[i][j]==target){
                    System.out.println("Element found at : " + i + " " + j);
                    return 0;
                }
            }
        }
        return -1;
    }
}