// Program to sort an array using the selection sort algorithm. 

import java.util.*; 

public class selectionsort{
    public static void sorting(int arr[]) {
        for (int i = 0; i < arr.length-1; i++) {
            int minPos = i; 
            for (int j = i + 1; j < arr.length; j++){
                if (arr[minPos] > arr[j]){
                    minPos = j;
                }
        } 
        int temp = arr[i]; 
        arr[i] = arr[minPos];
        arr[minPos] = temp;
        }  
    } 
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in); 

        int arr[] = new int[5]; 

        System.out.print("Enter the elements of an array: "); 
        for(int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt(); 
        }
        sorting(arr);
        for (int index = 0; index < arr.length; index++) { 
            System.out.print(arr[index]); }
    }
} 
