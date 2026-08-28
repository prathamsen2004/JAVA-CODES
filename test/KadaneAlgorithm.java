
/*

currentSum = currentSum + current element

agar currentSum < current element:
       currentSum = current element

maximumSum = max(maximumSum, currentSum) 

*/



import java.util.*;
public class KadaneAlgorithm{
    public static void ans(int arr[], int maxsum,int currsum){
        for(int i=0;i<arr.length;i++){
            currsum = currsum + arr[i];
            if(currsum < arr[i]){
                currsum = arr[i];
            }
            maxsum = Math.max(maxsum,currsum);
        }
        System.out.println(maxsum);
    }
    public static void main(String args[]){
        int arr [] = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int maxsum = arr[0];
        int currsum = arr[0];
        ans(arr,maxsum,currsum);

    }
}
















