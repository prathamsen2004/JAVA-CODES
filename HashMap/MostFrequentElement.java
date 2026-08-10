import java.util.*;
public class MostFrequentElement {
    public static void main(String args[]){
        int arr[] = {1,2,3,4,3,2,1,3,4,1,1,1};
        HashMap<Integer,Integer> map = new HashMap<>();
        int mostfreq = 0;
        int mostelement =0;
        for(int num : arr){
            if(map.containsKey(num)){
                map.put(num,map.get(num)+1);

            }else{
                map.put(num,1);
            }

        }
        for(int key : map.keySet()){
            if(map.get(key) > mostfreq){
                mostfreq = map.get(key);
                mostelement = key;
                 System.out.println(mostelement);

                System.out.println(mostfreq);

            }
        }
    }
    
}
