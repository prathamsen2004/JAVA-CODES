import java.util.*;
public class TwoSumHashMap{
    public static void main(String args[]){
        int arr[]= {1,2,3,24,6,7};
        int target = 9;
        int needed = 0;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            map.put(arr[i],i);
            
            needed = target - arr[i];
            if(map.containsKey(needed)){

            System.out.println("["+map.get(needed)+","+i+"]");
            }
            
        }
    }
}