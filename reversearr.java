// Program to reverse an array.

import java.util.*;

public class reversearr{
    public static void reverse(int arr[]){

        int first = 0, last = arr.length-1;
        while(first<last){
            int temp = arr[first];
            arr[first] = arr[last];
            arr[last] = temp;

            first++;
            last--;
        }
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int arr[] = new int[5];

        System.out.println("Enter the elements of an array: ");
        for(int i = 0; i<arr.length; i++){
        arr[i] = sc.nextInt();
    }

    reverse(arr);
    for(int i = 0; i<arr.length; i++){
        System.out.print(arr[i]);
    }
    sc.close();
    }
}