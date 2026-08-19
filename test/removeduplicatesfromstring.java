import java.util.*;
public class three{
    public static void main(String args[]){
        String str = "programming";
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i=0;i<str.length();i++){
            if(map.containsKey(str.charAt(i))){
                map.put(str.charAt(i),map.get(str.charAt(i))+1);
            }else{
                map.put(str.charAt(i),1);
            }
        }
        HashSet<Character> set = new HashSet<>();
        for(int j=0;j<str.length();j++){
            if(set.contains(str.charAt(j))){

            }else{
                System.out.print(str.charAt(j));
                set.add(str.charAt(j));

            }
        }
        

    }
    }





