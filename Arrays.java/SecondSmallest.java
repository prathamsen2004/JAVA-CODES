public class SecondSmallest {
    public static void main(String args[]){
        int arr[]={1,4,3,2,6,7};
        int smallest = Integer.MAX_VALUE;
        int second = Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            if(smallest > arr[i]){
                smallest = arr[i];
            }
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i] >smallest && second >arr[i]){
                second = arr[i];
            }
        }
        System.out.println(second);
    }
    
}
