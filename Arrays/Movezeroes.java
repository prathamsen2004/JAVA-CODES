import java.util.*;
public class Movezeroes {
     public static void main(String args[]){
        int arr[]= {1,0,2,0,3,0,4,0};
        int temp;
        int j=0;
        for(int i=0;i<arr.length-1;i++){
            if(arr[i] !=0){
               temp = arr[i];
               arr[i] = arr[j];
               arr[j] = temp;
               j++;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
    
}
