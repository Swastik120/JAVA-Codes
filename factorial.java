// Program to give the factorial of a given number (using functions).

import java.util.*;

public class factorial{
public static int facto(int num1){
    int i = 1, fact = 1;
    while(i<=num1){
         fact = fact*i;
        i++;
    }
    return fact;
}
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.print(facto(num));
    }
}