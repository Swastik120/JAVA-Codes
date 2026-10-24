// Program to print the subarrays of a given array using functions. 

import java.util.*; 

public class subarr{
    public static void search(int arr[]){
        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i]+" ");
            for (int j = i + 1; j < arr.length; j++){
                for (int k = i; k <= j; k++){
                    System.out.print(arr[k]); 
                }
                System.out.print(" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in); 

        int arr[] = new int[5]; 
        System.out.print("Enter the elements of an array: "); 

        for (int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt(); 
        }
        search(arr);
    }
}