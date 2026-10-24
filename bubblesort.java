// Program to sort an array using the bubble sort algorithm. 

import java.util.*; 

public class bubblesort{
    public static void sort(int arr[]) { 
        for(int i = 0; i<arr.length-1; i++){
            for(int j = 0; j<(arr.length -(i+1)); j++){
            
             if(arr[j]<arr[j+1]){
             int temp = arr[j];
             arr[j] = arr[j+1];
             arr[j+1] = temp;
             }
          }
       }  
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in); 

        int arr[] = new int[7]; 
        System.out.println("Enter the elements of an array:"); 
        for (int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt(); 
        }
        sort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]); 
        }

    }
}  