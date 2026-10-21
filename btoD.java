// Program to convert a binary number to a decimal number.

import java.util.*;
public class btoD{
    public static int convert(int n){
        int con = 0, pow = 0;

        while(n>0){
        int lastdig = n%10;
        con += (lastdig * Math.pow(2,0));
        
        n /= 10;
        pow++;
        }
        return con;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
            int num = sc.nextInt();
            System.out.println(convert(num));

        }
    }
