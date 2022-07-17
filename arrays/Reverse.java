

// {23,3,10,9,7} -> {7,9,10,3,23}
public class Reverse{
    public static void main(String[] args) {
        int[] a = {23,3,10,9,7,55,67,9,12};
        int j=a.length-1;

        for(int i=0;i<j;i++){
            int t=a[i];
            a[i]=a[j];
            a[j]=t; 
            j--;
        }
        for(int i=0; i<a.length; i++){
            System.out.print(a[i] + " ");
        }
    }
}