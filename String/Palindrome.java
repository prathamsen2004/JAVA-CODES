import java.util.*;
public class Palindrome {
    public static void main(String args[]){
     String s = "A man, a plan, a canal: Panama";
  
     if(s.equals("")){ // we can also use s.isEmpty() here in place of s.equals();
        System.out.println("true");
     }
     s = s.toLowerCase();
     s = s.replaceAll("[^a-z0-9]","");
       String t = new StringBuffer(s).reverse().toString();
     if(s.equals(t)){
        System.out.println("true");
     }else{
        System.out.println("false");
     }
    }
    
}
