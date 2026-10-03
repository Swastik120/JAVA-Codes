import java.util.*;

public class largof3{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();

        if(A>B && A>C){
          System.out.println("Greatest is A");
        }
        else if(B>C){
            System.out.println("Greatest is B");
        }  
        else{
            System.out.println("Greatest is C");
        }
    }
}