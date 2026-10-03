// Print numbers from 1 to n.

import java.util.*;

public class oneton{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

    int n = 1;
    int num = sc.nextInt();

    while(n<=num){
        System.out.println(n);
        n++;
    }
    }
}