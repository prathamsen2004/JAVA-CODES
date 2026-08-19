import java.util.*;
public class sixth {
    public static void main(String args[]){
        int arr[]= {1, 2,4, 5,6};
        int sum =0;
        int expected = 0;

        int n = 6;
        for(int i=0;i<arr.length;i++){
            sum = sum + arr[i];
           
            }
            expected = n *(n+1)/2;
             int missing = expected - sum;
             System.out.println(missing);
           
        

    }
    
    
}
