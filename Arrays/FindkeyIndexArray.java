public class FindkeyIndexArray {
    public static void main(String args[]){
        int arr[] = {12,7,25,9,18};
        int target = 9;
        for(int i=0;i<arr.length;i++){
            if(target == arr[i]){
                System.out.println(i);
            }
        }
        
    }
}
