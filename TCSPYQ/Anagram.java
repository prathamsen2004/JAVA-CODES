import java.util.*;
public class Anagram {
    public static void main(String args[]){
        String str1 = "listen";
        String str2 = "silent";
        char ch1[] = str1.toCharArray();
        char ch2[] = str2.toCharArray();
        Arrays.sort(ch1);
        Arrays.sort(ch2);
        String new1 = new String(ch1);
        String new2 = new String(ch2);
        if(new1.equals(new2)){
            System.out.println("the given string is anagram");
        }
        else{
            System.out.println("the given strings are not anagram");
        }
    }
    
}
