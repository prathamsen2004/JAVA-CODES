public class average {
    public static void main(String args[]){
        int arr[]={2, 4, 6, 8, 10};
        int size =5;
        int temp =0;
        int average =0;
        for(int i=0;i<arr.length;i++){
            temp = temp + arr[i];
        }
        average =  temp / 5;
        System.out.println(average);
    }
    
}
