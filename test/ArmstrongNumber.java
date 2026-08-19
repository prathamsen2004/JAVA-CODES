public class seventh{
    public static void main(String args[]){
        int digit = 153;
        int first = digit /100;

        int temp = digit/10;
         int second = temp%10;
        
        
        int third = digit%10;

        int sum = (int)Math.pow(first,3);

        sum = sum + (int)Math.pow(second,3);

        sum = sum + (int)Math.pow(third,3);
        if(sum == digit){
            System.out.println(" the number is armstrong");
        }else{
              System.out.println(" the number is not armstrong");
        }

       

       

        
    }
}