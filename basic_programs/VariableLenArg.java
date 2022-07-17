
public class VariableLenArg {
    public static void main(String[] args) {
        input(23, 23, "sdtfces","fxia","rsdf","hjhgf","hgjbvht","asdfhioia");
    }

    static void input(int a, int b, String ...name){
        int sum=a+b;
        System.out.println("Sum : " + sum);
    }
}
