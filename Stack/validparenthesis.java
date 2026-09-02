import java.util.*;
public class validparenthesis {

    public static boolean ans(String str){
         Deque<Character> stack = new ArrayDeque<>();
        for(int i=0;i<str.length();i++){
            char current = str.charAt(i);
            if(current == '(' || current == '{' || current == '['){
                stack.push(current);
            }
            else{
                if(stack.isEmpty()){
                    return false;
                }
                char top = stack.peek();
                if((top == '(' && current == ')') || (top == '{' && current == '}') || (top == '[' && current == ']')){
                    stack.pop();
                }else{
                    return false;
                }
            }
           
        }
        return stack.isEmpty();
        
    }
    public static void main(String args[]){
        String str = "({[]})";
        System.out.println(ans(str));
       
    }



    
}
