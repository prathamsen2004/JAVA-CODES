import java.util.*;
public class largest {
    public static void main(String args []){
        int arr[] = {10, 25, 7, 42, 18, 31};
        int right = arr.length-1;
        int left = 0;
        int temp;


             while(right > left){
                    temp = arr[right];
                    arr[right] = arr[left];
                     arr[left] = temp;
                    
                     right--;
                     left++;
                     
                }
         System.out.println(Arrays.toString(arr));  
    
   }
}
