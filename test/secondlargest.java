import java.util.*;
public class first{

    public static void second(int arr[],int largest,int secondlargest,boolean found){
        for(int i=0;i<arr.length;i++){
            if(arr[i] > largest){
                largest = arr[i];
            }
        }
       for( int i=0;i<arr.length;i++){
        if(arr[i] > secondlargest && arr[i] != largest){
            secondlargest = arr[i];
            found = true;
          
        }
        
    }
    if(found){
        System.out.println(secondlargest);

    }else{
        System.out.println("no secondlargest element exists");
    }     
    } 

    public static void main(String args[]){
 int arr[] = {10,10};
 int largest = Integer.MIN_VALUE;
 int secondlargest = Integer.MIN_VALUE;
 boolean found = false;
 second(arr,largest,secondlargest,found);
        
    }
}