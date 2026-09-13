import java.util.*;
public class Threesome {
    public static ArrayList<ArrayList<Integer>> ans(ArrayList<Integer> list){
        Collections.sort(list);
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        for(int i=0;i<list.size();i++){
            if(i>0 && list.get(i)== list.get(i+1)){
                continue;
            }

            int  j = i+1;
            int k = list.size()-1;
            while(j<k){
                int sum = list.get(i) + list.get(j) + list.get(k);
                if(sum ==0){
                    ArrayList<Integer> triplet = new ArrayList<>();

                    triplet.add(list.get(i));
                    triplet.add(list.get(j));
                    triplet.add(list.get(k));

                    result.add(triplet);
                    j++;
                    k--;
                }
                if ( j>0 && list.get(j) == list.get(j+1)){
                    j++;
                }
                if(k>0 && list.get(k) == list.get(k+1)){
                    k--;
                }
                if(sum < 0){
                    j++;
                }
                else{
                    k--;
                }
            }
        }return result;

    }
    public  static void main(String args[]){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(-1);
        list.add(0);
        list.add(1);
        list.add(2);
        list.add(-1);
        list.add(-4);
        ans(list);
    }
}
