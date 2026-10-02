// To check whther the given number is odd or even.

import java.util.*;

public class oddev{
    public static void main(String args []){
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        if(num%2==0){
          System.out.println("Even");  
        }
        else{
           System.out.print("Odd");
        }
    }
}