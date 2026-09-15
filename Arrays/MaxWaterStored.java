
//THIS IS BRUTEFORCE APPROACH BUT HERE THE TIME COMPLEXITY IS O(^N);


/* 

import java.util.*;
public class MaxWaterStored{
    public static int ans(int height[]){
        int maxwater = 0;
        for(int i=0;i<height.length-1;i++){
            for(int j=i+1;j<height.length;j++){
                int ht = Math.min(height[i],height[j]);
                int width = j-i;
                int waterstored = ht * width;

                maxwater = Math.max(maxwater,waterstored);


            }

        }
        return maxwater;

        


    }
    public static void main(String args[]){
        int height[] = {1,8,6,2,5,4,8,3,7};
        System.out.println(ans(height));



    }
}

*/



// NOW THE TWO POINTER APPROACH 


import java.util.*;
public class MaxWaterStored{

    public static int ans(int arr[]){
        int maximum = 0;
        int right = arr.length-1;
        int left = 0;
        while(left < right){
            int height = Math.min(arr[right],arr[left]);
            int width = right - left;

            int water = height * width;
            maximum = Math.max(maximum,water);
            if(arr[left] < arr[right]){
                left++;
            }else{
                right--;
            }
        
        }
        return maximum;

    }
    public static void main(String args []){
        int arr[] = {1,8,6,2,5,4,8,3,7};
        System.out.println(ans(arr));
    }
}