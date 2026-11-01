// Program to sort an array using the heap sort algorithm. 

import java.util.*;
public class Heapsort{
    public static void sort(int arr[]){

        // Converting a CBT into MAXHEAP.
        for(int i = (arr.length-1)/2; i>=0; i--){
            heapify(arr,i,arr.length-1);
        }

        for(int i = arr.length-1; i>=0; i--){
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            heapify(arr,0,i);
        }}

        public static void heapify(int arr[],int i,int size){
            int maxind = i;
            int left = (2*i)+1;
            int right = (2*i)+2;

            if(left<size && arr[left]>arr[maxind]){
                maxind = left;
            }
            if(right<size && arr[right]>arr[maxind]){
                maxind = right;
            }

            if(maxind != i){
                int temp = arr[i];
                arr[i] = arr[maxind];
                arr[maxind] = temp;
                
                heapify(arr,maxind, size);
            }
        }

    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int arr[] = new int[5];
        System.out.print("Enter the elements of an array: ");
        for(int i = 0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
        sort(arr);
        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i]);
        }
    }
}