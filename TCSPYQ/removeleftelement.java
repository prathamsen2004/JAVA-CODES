import java.util.*;
public class removeleftelement {
    public static void remove(int arr[], int temp[], int index) {

    for(int i = 0; i < arr.length - 1; i++) {

        if(arr[i] >= arr[i + 1]) {
            temp[index] = arr[i];
            index++;
        }
    }

    // Last element ko hamesha retain karna
    temp[index] = arr[arr.length - 1];

    System.out.println(Arrays.toString(temp));


    int newArr[] = new int[index];
    int k=0;
    for(int j=0;j<index;j++){
    
        newArr[k]  = temp[j];
        k++;
    }
    System.out.println(Arrays.toString(newArr));
}


    
    public static void main(String args []){
        int arr[] ={5, 3, 4, 4, 7, 3, 6};
         int temp[]=new int[arr.length];
                int index = 0;
        remove(arr,temp,index);    
           

    }
    
    
}
