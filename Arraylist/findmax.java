import java.util.*;
public class findmax{
    public static void main(String args[]){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(9);
        list.add(18);
        list.add(22);
        list.add(1);
        int max = Integer.MIN_VALUE;
        for(int i=0;i<list.size();i++){
            if(max < list.get(i)){
                max = list.get(i);
            }
        }
        System.out.println(max);

    }
}