
import java.util.*;
public class TwoSum {
    public static void main(String args[]){
        HashMap<String,Integer> map = new HashMap<>();
        map.put("Rohit",0);
        map.put("Shivam",1);
        map.put("pratham",2);
       System.out.println(map);
       map.remove("Shivam");
       System.out.println(map);
        map.put("Shivam",1);
       for(String key : map.keySet()){
    System.out.println(key);
}
        
    }
    
}
