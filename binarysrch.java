// Program to find the element using the binary search technique. 

import java.util.*;
public class binarysrch{
    public static int srrch(int arr[], int n){
        int start = 0; int end = arr.length-1; int mid = 0;
        while(start<=end){

            mid = (start+end)/2;

            if(arr[mid]==n){
                return mid;
            }
            else if(arr[mid]>n){
                end = mid-1;
            }
            else if(arr[mid]<n){
                start = mid+1;
            }
        }
        return -1;
    }
public static void main(String args[]){
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter the elements of an array: ");
    int arr[] = new int[5];
    for(int i = 0; i<arr.length; i++){
        arr[i] = sc.nextInt();
    }
    
    System.out.print("Enter the element to find in an array: ");
    int num = sc.nextInt();
    
    System.out.println(srrch(arr,num));
 }
} 