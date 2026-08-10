import java.util.*;
public class ElementPresentInBothArray{
    public static void main(String args[]){
        int arr1[] = {1,2,3,4,5};
        int arr2[] = {2,8,9,0,3};
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int num : arr1){
            map.put(num,1);

        }
        for(int num : arr2){
            if(map.containsKey(num)){
                System.out.println(num);
            }
        }
    }
}