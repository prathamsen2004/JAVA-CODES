import java.util.*;
public class secondlargest{
    public static void main(String args[]){
        int arr[]= {1,2,3,2,1,3,4,3,5,6,7,3,2,1};
        boolean isboolean;
        HashMap<Integer,Integer>map = new HashMap<>();
        for(int num : arr){
            if(map.containsKey(num)){
            System.out.println("contains duplicate");
            }
            else{
                System.out.println("not contains duplicate ");
               
            }

        }
       
    }
}