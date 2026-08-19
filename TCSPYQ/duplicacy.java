import java.util.*;
public class duplicacy {
    public static void main(String args []){
        int arr[] = {4,5,1,2,1,4,5};
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int num : arr){
        if(map.containsKey(num)){
            map.put(num,map.get(num)+1);
        }else{
            map.put(num,1);
        }
       

        }
        for(int key : map.keySet()){
            if(map.get(key) == 1){
                System.out.println(key);
                break;

            }
            
        }
    }
    
}
