import java.util.*;
public class string {
    public static void ans(String str){
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i=0;i<str.length();i++){
            if(map.containsKey(str.charAt(i))){
                map.put(str.charAt(i),map.get(str.charAt(i))+1);
            }
            else{
                map.put(str.charAt(i),1);

            }
            

        }
        for(int j=0;j<str.length();j++){
            if(map.get(str.charAt(j)) == 1){
                System.out.println(str.charAt(j));
                break;

            }
        }
    }
    public static void main(String args []){
        String str = "swiss";
        ans(str);

    }
    
}
