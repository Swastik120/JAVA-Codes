// Program to find a number(key) using linear search technique.

import java.util.*;

public class linearsearch{
    public static int Linear(int arr[], int KEY){
        for(int i = 0; i<arr.length; i++){
            if(arr[i]==KEY){
                return i;
            }
        }
        return -1;
    }
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        int arr[] = new int[4];
        for(int i = 0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
        int key = sc.nextInt();

        System.out.println(Linear(arr,key));
    }
}