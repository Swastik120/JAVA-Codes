// print sum of first n natural num.

import java.util.*;

public class sumofn{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int sum = 0;
        int n = 1;

        while(n<=num){
            sum += n;
            n++;
        }
        System.out.println("The sum is: "+ sum);
    }
}