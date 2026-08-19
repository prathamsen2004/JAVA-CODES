import java.util.*;
public class fourth{
    public static void stock(int arr[],int buy,int sell,int max){
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                buy = arr[i];
                sell = arr[j];
                int temp = arr[j] - arr[i];
                if(max < temp){
                    max = temp;

                }
            }
        }
        if(max == 0){
                    System.out.println(0);
                }

        System.out.println(max);
    }
public static void main(String args[]) {
    int arr [] ={7,1,5,3,6,4};
    int buy = 0;
    int sell = 0;
    int max = Integer.MIN_VALUE;
    stock(arr,buy,sell,max);
    
}
}
