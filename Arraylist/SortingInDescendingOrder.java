import java.util.*;


public class SortingInDescendingOrder {
    public static void main(String args[]){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(9);
        list.add(45);
        list.add(7);
        list.add(13);
        Collections.sort(list,Collections.reverseOrder());
        System.out.println(list);
    }
    
}
