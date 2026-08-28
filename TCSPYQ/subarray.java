import java.util.*;
public class subarray{
    public static void sub(int arr[], int key){
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0,-1);
        int sum =0;
        int maxlen =0;
        for(int i=0;i<arr.length;i++){
            sum = sum + arr[i];
            if(map.containsKey(sum-key)){
                int previousindex = map.get(sum -key);
                maxlen = Math.max(maxlen,i-previousindex);
            }
            if(!map.containsKey(sum)){
                map.put(sum,i);
            }
        }
        System.out.println(maxlen);
    }
    public static void main(String args[]){
        int arr[] = {10, 5, 2, 7, 1, 9};
        int key = 15;
        sub(arr,key);
    }
}