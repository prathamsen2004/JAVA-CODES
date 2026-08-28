import java.util.*;
public class maxtimeoccurance {
    public static void main(String args[]){
        int arr[] = {2, 3, 2,2,2, 4, 3, 2, 5, 3};
        int max =0;
        int mostfreq =0;
        int element =0;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            if(map.containsKey(arr[i])){
             map.put(arr[i],map.get(arr[i])+1);
                

                
            }
            if(!map.containsKey(arr[i])){
                map.put(arr[i],1);
            }

        }
        for(int key : map.keySet()){
            if(map.get(key) > mostfreq ){
                mostfreq = map.get(key);
                element = key;
                
            }

        }
        System.out.println(mostfreq);
        System.out.println(element);
       }
        
    }

