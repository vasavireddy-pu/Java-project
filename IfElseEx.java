import java.util.Scanner;

public class IfElseEx {
    public static void main(String[] args) {
        int num;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter value for num");
        num=scanner.nextInt();
        if(num%2==0)
             System.out.println(num+" is even number");
        else
            System.out.println(num+" is odd number");
    }
}
