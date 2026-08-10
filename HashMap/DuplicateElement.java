import java.util.*;
public class DuplicateElement{
    public static void main(String args[]){
        int arr[] = {1,2,3,4,3,2,1,3,4,2,6};
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int num : arr){
            if(map.containsKey(num)){
                map.put(num,map.get(num)+1);
            }else{
                map.put(num,1);
            }
        }
        for(int key : map.keySet()){
            if(map.get(key) > 1){
                System.out.println(key);

            }

        }
    }
}




