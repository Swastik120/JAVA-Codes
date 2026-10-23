// Program to print the subarrays of a given array or the number given by the user in an array.
import java.util.*; 
public class subarr{

public static void pairsOf(int arr[]){

    for (int i = 0; i < arr.length; i++){
        for (int j = i + 1; j <= arr.length; j++){
        System.out.print("(" +i+ "," +j+ ")" + " "); 
            }
        System.out.println();
    }
}
 public static void main(String[] args){
 Scanner sc = new Scanner(System.in);

 int arr[] = new int[5];         
 
 System.out.print("Enter the elements of an array:"); 
    for (int i = 0; i < arr.length; i++){
        arr[i] = sc.nextInt(); 
    }
    pairsOf(arr);
    }
}