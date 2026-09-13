import java.util.*;
public class PairSum{
    public static boolean sum(ArrayList<Integer> list, int target){
        int rp = list.size()-1;
        int lp = 0;
        while(rp != lp){
            if(list.get(rp) + list.get(lp) == target){
                return true;
            
            }if(list.get(rp) + list.get(lp) > target){
                rp--;
            }else{
                lp++;
            }
        }
        return false;
    }
    public static void main(String args []){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(3);
        list.add(6);
        list.add(19);
        Collections.sort(list);
        int target =9;

       boolean ans = sum(list,target);
       System.out.println(ans);
    }
}