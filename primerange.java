// Program to print the prime numbers in the range.

import java.util.*;

public class Prime{
    public static void printPrime(int n){
        for(int i = 0 ; i<=n; i++){
            if(isPrime(i)==true){
                System.out.println(i);
            }
        }
        return;

    }
    public static boolean isPrime(int n){
        if(n==2){
            return true;
        }
        else if(n<2){
            return false;
        }
        else{
            for(int i = 2; i<=Math.sqrt(n); i++){
            if(n%i==0){
                return false;
            }
        }
    }
        
        return true;
    }
    public static void main(String args[]){
    
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    printPrime(num);
}
}