// Check if a number is prime or not.

import java.util.*;

public class Prime{
    public static boolean isPrime(int n){
        if(n==2){
            return true;
        }
        else if(n<=1){
            return false;
        }
        for(int i = 2; i<=Math.sqrt(n); i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
    public static void main(String args[]){
    
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    if(isPrime(num)==true){
        System.out.println("Prime");
    }
    else{
        System.out.println("Not Prime");
    }
}
}
//         Scanner sc = new Scanner(System.in);

//         boolean isPrime = true;
//         System.out.print("Enter any number: ");
//         int n = sc.nextInt();

//         if(n<=1){
//             System.out.println("Not Prime");
//         }

//          else if(n==2){
//             System.out.println("\nPrime");
//             }

//         else{

//         int i=2;
//         while(i<n){
//             if(n%i==0){
//                 isPrime = false;
//                 break;
//             }
//             i++;
//         }

//         if(isPrime == false){
//             System.out.println("Not Prime");
//         }
//         else{
//             System.out.println("Prime");
//         }
//      }
        
//     }
// }