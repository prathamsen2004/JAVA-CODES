public class nineth {
    public static void main(String args[]){
        int arr [] = {2, 7, 11, 15};
        int key =9;
        boolean found = false;
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i] + arr[j] == key){
                    System.out.println("yes");
                    found = true;
                }
            }
        }
        if(!found){
            System.out.println("no");
        }
    }
    
}
