// Program to print the maximum sum of a subarray. 
import java.util.*; 

public class subarr{
    public static int search(int arr[]){

        int currentSum = 0, maxSum = Integer.MIN_VALUE; 
        for (int i = 0; i < arr.length; i++){
            for (int j = i; j < arr.length; j++){
                
                currentSum = 0;
                for (int k = i; k <= j; k++){
                    currentSum += arr[k];
                }
                if(currentSum > maxSum){
                    maxSum = currentSum;
                }
                System.out.println(currentSum); 

            }
        }
        return maxSum;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in); 

        int arr[] = new int[5]; 
        System.out.print("Enter the elements of an array: "); 

        for (int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt(); 
        }
        System.out.print("The maximum subarray is: "+ search(arr));
    }
}