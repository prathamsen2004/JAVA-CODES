
import java.security.Key;
import java.util.*;
public class countfrequency{
    public static void main(String args[]){
        int arr[]={1,1,2,1,3,2,1};
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int key: map.keySet()){
            if(map.containsKey(key)){
                map.put(key,map.get(key)+1);
            }
            else{
                map.put(key,1);
            }
        }
        System.out.println(key);
}
}