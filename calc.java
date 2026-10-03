import java.util.*;

public class calc{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the first integer: ");
        int a = sc.nextInt();

        System.out.println("Enter the second integer: ");
        int b = sc.nextInt();

        System.out.println("Enter the operator: ");
        char op = sc.next().charAt(0);

        switch(op){
            case '+' :
                System.out.println(a+b);
                break;
            
            case '-' :
                System.out.println(a-b);
                break;

            case '*' :
                System.out.println(a*b);
                break;

            case '/' :
                System.out.println(a/b);
                break;

            case '%' :
                System.out.println(a%b);
                break;

            default :
                 System.out.println("Invalid Operator");
        }

    }
}