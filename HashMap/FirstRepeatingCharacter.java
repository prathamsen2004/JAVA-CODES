import java.util.*;
public class FirstRepeatingCharacter{
    public static void main(String args []){
        String str = " abccde";
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i=0;i<str.length();i++){
            if(map.containsKey(str.charAt(i))){
                System.out.println(str.charAt(i));
                break;
            }
            else{
                map.put(str.charAt(i),i);
            }
        }
    }
}