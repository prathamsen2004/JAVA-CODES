import java.util.*;
public class RightElementGreaterOrNot{
    public static void main(String args []){
        int arr[] = {4, 5, 2, 10, 8};
        Deque<Integer> stack = new ArrayDeque<>();
         int result[] = new int[arr.length];
        for(int i=arr.length-1;i>=0;i--){
           
            while(!stack.isEmpty() && stack.peek() <= arr[i]){
                stack.pop();
            }
            if(stack.isEmpty()){
                result[i] = -1;

            }
            else{
                result[i] = stack.peek();
            }
            stack.push(arr[i]);
        }
        System.out.println(Arrays.toString(result));
    }
}