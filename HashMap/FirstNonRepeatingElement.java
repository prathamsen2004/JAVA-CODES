import java.util.*;
public class FirstNonRepeatingElement{
    public static void main(String args[]){
        int arr[]={1,2,3,2,3,1,4,6,5,3};
        int left = 0;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int num : arr){
            if(map.containsKey(num)){
                map.put(num,map.get(num)+1);

            }
            else{
                map.put(num,1);
            }

        }
        for(int num : arr){
            if(map.get(num) == 1){
            
                System.out.println(num);
                break;
             }
                
            }
        }
    }
