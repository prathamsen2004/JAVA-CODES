/* 
import java.util.*;
public class revision{
    public static void main(String args[]){
        int arr[]={1,2,3,4,5};
        int right = arr.length-1;
        int left = 0;
        int temp =0;
        while(right > left){

            temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
             



        }
        System.out.println(Arrays.toString(arr));
       
        
        
        
        }
}

*/



/* 
import java.util.*;
public class revision{
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

*/

import java.util.*;
public class revision{
    public static void main(String args[]){
        int arr[]={1,2,3,4,5};
        int temp = arr[0];
        for(int i=0;i<arr.length-1;i++){
            arr[i]= arr[i+1];
         
        }
           arr[arr.length-1]=temp;
        System.out.println(Arrays.toString(arr));
    }
}