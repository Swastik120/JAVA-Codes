// Program to sort an array using the insertion sort algorithm. 

import java.util.*; 

public class insertion{
    public static void sort(int arr[]){

        for (int i = 1; i < arr.length; i++){
            int temp = arr[i];
            int prev = i-1;
            while(prev>=0 && (arr[prev]>temp)){
                arr[prev+1]  = arr[prev];
                prev--;
            }
            arr[prev+1] = temp;
        }
    } 
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in); 
        int arr[] = new int[5]; 

        System.out.print("Enter the elements of an array: ");
        for (int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }
            sort(arr);
            for (int i = 0; i < arr.length; i++){
                System.out.print(arr[i]); 
            }
        

    }
}