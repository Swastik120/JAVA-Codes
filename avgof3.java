// Write a Java method to compute the average of three numbers..

import java.util.*;

public class avgof3{
    public static int avg(int num1, int num2, int num3){
        return (num1*num2*num3)/3;

    }
    public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();

    System.out.println(avg(a,b,c));
    }
}