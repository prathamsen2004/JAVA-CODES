import java.util.*;
public class pyq{
    public static void reverse(int temp,int left,int right,int arr[],int smallest,int largest,int secondlargest,int secondsmallest){
        for(int i=0;i<arr.length-1;i++){

            if(left < right){
                temp = arr[right];
                arr[right] = arr[left];
                arr[left] = temp;
                left++;
                right--;

            }
           
        }
         System.out.println(Arrays.toString(arr));
        for(int i=0;i<arr.length;i++){
            if(arr[i] < smallest){
                smallest = arr[i];
            }
            if(arr[i] > largest ){
               largest = arr[i]; 
            }
        }
        
         secondsmallest = arr[arr.length-2];
         secondlargest = arr[1];
         int result = largest * smallest + secondlargest * secondsmallest;
         System.out.println(result);
         

        
    
    }
    public static void main(String args []){
        int arr[] = {7,2,9,4};
        Arrays.sort(arr);
        int left = 0;
        int temp = 0;
        int right = arr.length-1;
        int smallest =Integer.MAX_VALUE;
        int largest = Integer.MIN_VALUE;
        int secondlargest = 0;
        int secondsmallest = 0;
        reverse(temp, left, right, arr, smallest,largest, secondlargest,secondsmallest);

    }
}