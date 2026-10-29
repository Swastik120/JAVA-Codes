// Program to sort an array using the quicksort algorithm. 

import java.util.*;

public class quicksort { 

    public static void sort(int arr[], int start, int end){
        if(start<end){
            int pIndex = partition(arr,start,end);


            // For the left half.
            sort(arr, start, pIndex-1);
            sort(arr, pIndex+1, end);
        }
    }

    public static int partition(int arr[], int start, int end){
        int pivot = arr[end];
        int index = start-1;

        for (int i = start; i < end; i++){
            if(arr[i]<pivot){
                index++;
                int temp = arr[index];
                arr[index] = arr[i];
                arr[i] = temp;
            }
        }
        index++;
        int temp = arr[index];
        arr[index] = arr[end];
        arr[end] = temp;

        return index;
    }


    public static void main(String args[]){
        Scanner sc = new Scanner(System.in); 
        int arr[] = new int[5]; 

        System.out.println("Enter the elements of an array"); 
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt(); 
    }
    sort(arr,0,arr.length-1);
    for (int i = 0; i < arr.length; i++) {
        System.out.print(arr[i]); 
    }
  }  
}