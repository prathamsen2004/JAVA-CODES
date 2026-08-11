import java.util.*;
public class FrequencyOfEachCharacter {
    public static void main(String args[]){
        String str = "programming";
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i=0;i<str.length();i++){
            if(map.containsKey(str.charAt(i))){

            }
            else{
                map.put(str.charAt(i),1);
            }
        }
        for(int key : map.keySet()){
            if (map.containsKey(key)){
            map.get(key);

            }

        }
    }
}
