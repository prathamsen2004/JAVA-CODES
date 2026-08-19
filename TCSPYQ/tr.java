import java.util.*;
public class tr {
    public static void remove(int arr[],int temp[],int index){
        for(int i=0;i<arr.length-1;i++){
            if(arr[i] >= arr[i+1]){
                temp[index] = arr[i];
                index++;
            }
        }
        temp[index] = arr[arr.length-1];
        index++;
       int newArr[] = new int[index];
       int k=0;
       for(int j=0;j<index;j++){
        newArr[k] = temp[j];
        k++;

       }

       int nw[] = new int[newArr.length];
       int z = 0;

       
      for(int l = 0; l < newArr.length - 1; l++) {

    if(newArr[l] >= newArr[l + 1]) {
        nw[z] = newArr[l];
        z++;
    }
}

// last element
nw[z] = newArr[newArr.length - 1];
z++;

System.out.println(Arrays.toString(nw));

    }
    public static void main(String args[]){
        int arr[] = {5, 3, 4, 4, 7, 3, 6};
        int temp[] = new int[arr.length];
        int index=0;
        remove(arr,temp,index);

    }
    
}
