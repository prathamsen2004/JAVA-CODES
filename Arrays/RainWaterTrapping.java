/* 
public class RainWaterTrapping {
    public static int ans(int height[],int rightMax,int leftMax,int right,int left){
        int water =0;
      
        while (left < right) {

    if (height[left] <= height[right]) {

        if (height[left] >= leftMax) {
            leftMax = height[left];
        } else {
            water = water + leftMax - height[left];
        }

        left++;

    } else {

        if (height[right] >= rightMax) {
            rightMax = height[right];
        } else {
            water = water + rightMax - height[right];
        }

        right--;
    }
   
}
 return water;

       }
    public static void main(String args[]){
        int height[] = {4, 2, 0, 3, 2, 5};
          int left = 0;
        int right =height.length-1;
        int rightMax =0;
        int leftMax = 0;
        System.out.println(ans(height,rightMax,leftMax,right,left));

      


    }
    
}

*/

import java.util.*;
public class RainWaterTrapping{
    public static int ans(int arr[]){
        int right = arr.length-1;
        int left = 0;
        int rightmax =0;
        int leftmax=0;
        int water =0;
        while(left < right){
            if(arr[left]<=arr[right]){
                if(arr[left]>leftmax){
                    leftmax = arr[left];
                }else{
                    water = water + leftmax - arr[left];
                }
                left++;
            }else{
                if(arr[right]>rightmax){
                    rightmax = arr[right];

                }else{
                    water = water + rightmax - arr[right];
                }
                right--;
            }

        }
        return water;
    }
    public static void main(String args[]){
    int arr[]=  {4, 2, 0, 3, 2, 5};
    System.out.println(ans(arr));
}
}