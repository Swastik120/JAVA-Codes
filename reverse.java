// Reversing a number.

import java.util.*;
 public class reverse{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int reverse = 0;

        while(num>0){

            int lastdig = num%10;
            reverse = (reverse*10) + lastdig;
            num /=10;
            
        }

        System.out.println(reverse);
    }
 }