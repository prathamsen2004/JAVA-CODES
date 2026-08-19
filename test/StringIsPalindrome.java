import java.util.*;
public class fifth {
    public static void main(String args[]){
        String str = "racecar";
        String str2 = "";
        for(int i=str.length()-1;i>=0;i--){
            str2 = str2 + str.charAt(i);


        }
        if(str.equals(str2)){
            System.out.println("string is palindrome");
        }else{
            System.out.println("String is not palindrome");
        }

    }
    
}
