// Program to get the product of A and B (Using functions)

import java.util.*;
public class pdtofandb{
    public static int pdt(int num1, int num2){
        return num1*num2;
    }
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        System.out.println(pdt(A,B));
    }
}