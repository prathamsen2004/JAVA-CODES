/* 

import java.util.*;
public class MockTest{
   
    public static void main(String args []){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the name");
        String str1 = sc.nextLine();
        
        String str2 = "";
        for(int i=str1.length()-1;i>=0;i--){
            str2 = str2 +str1.charAt(i);

        }
        if(str1.equals(str2)){
            System.out.println("string is palindrome ");
        }
        else{
            System.out.println("String is not palindrome");
        }

    }
}




import java.util.*;
public class MockTest{
    public static void ans(int arr[],int largest){
        int secondlargest = 0;
        for(int i=0;i<arr.length;i++){
            if(largest < arr[i]){
                largest = arr[i];
            }
            if(largest > arr [i] && largest != arr[i] && secondlargest <arr[i]){
                secondlargest = arr[i];
            }

        }
        System.out.println(secondlargest);
        
    }
    public static void main(String args []){
        int arr[]  = {10,5,8,20,15,20};
        int largest =Integer.MIN_VALUE;
        ans(arr,largest);
        

    }
}




import java.util.*;
public class MockTest{
    public static void ans(int arr[]){
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<arr.length;i++){

            if(map.containsKey(arr[i])){
                map.put(arr[i],map.get(arr[i])+1);
            }else{
                map.put(arr[i],1);
            }

        }
        for(int key : map.keySet()){
            if( map.get(key) > 1){
                System.out.print(key);

            }

        }
    }
    public static void main(String args []){
        int arr [] = {1,2,3,2,4,5,1,3};
        ans(arr);
    }
}



import java.util.*;
public class MockTest{
    public static void ans(String str){
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i=0;i<str.length();i++){
            if(map.containsKey(str.charAt(i))){
                map.put(str.charAt(i),map.get(str.charAt(i))+1);
            }
            else{
                map.put(str.charAt(i),1);
            }
            

        }
        for(int j=0;j<str.length();j++){
            if(map.get(str.charAt(j)) == 1){
                System.out.print(str.charAt(j));
                break;

            }

        }

        
    }
    public static void main(String args []){
        String str = "swiss";
        ans(str);

    }

}



import java.util.*;
public class MockTest{
    public static void ans(String str1,String str2){
        char ch1[]  = str1.toCharArray();
        char ch2[] = str2.toCharArray();
        Arrays.sort(ch1);
        Arrays.sort(ch2);
        String nstr1 = new String(ch1);
        String nstr2 = new String(ch2);
        if(nstr1.equals(nstr2)){
            System.out.println(" the given strings are anagram");
        }
        else{
            System.out.println(" the given strings are not anagram");
        }

    }
    public static void main(String args[]){
        String str1 = "silent";
        String str2 = "listen";
        ans(str1,str2);

    }

}



import java.util.*;
public class MockTest{
    public static void ans(String str){
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i=0;i<str.length();i++){
            if(map.containsKey(str.charAt(i))){
                map.put(str.charAt(i),map.get(str.charAt(i))+1);
            }
            else{
                map.put(str.charAt(i),1);
            }

        }
    }
         
    public static void main(String args[]){
        String str = "programming";
        ans(str);
    }
}




import java.util.*;
public class MockTest{
    public static void ans(int arr[]){
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i],map.get(arr[i])+1);
            }else{
                map.put(arr[i],1);
            }
        }
        for(int key : map.keySet()){
            if(map.get(key) > 1){
                System.out.println(key);
            }
        }
    }
    public static void main(String args []){
        int arr [] = {1, 2, 3, 2, 4, 5, 1, 3};
        ans(arr);
    }
}



import java.util.*;
public class MockTest{
    public static void ans(String str){
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i=0;i<str.length();i++){
            if(map.containsKey(str.charAt(i))){
                map.put(str.charAt(i),map.get(str.charAt(i))+1);
            }
            else{
                map.put(str.charAt(i),1);
            }
        }
        HashSet<Character> set = new HashSet<>();
        for(int j=0;j<str.length();j++){
           if(map.get(str.charAt(j)) ==1){
            System.out.println(str.charAt(j));
            break;

           }
          
        }
    }
    public static void main(String args[]){
        String str = "swiss";
        ans(str);
    }
}



import java.util.*;
public class MockTest{

    public static void main(String args []){
        String str1 = "listen";
        String str2 = "silent";
        char ch1[] = str1.toCharArray();
        char ch2[] = str2.toCharArray();
        Arrays.sort(ch1);
        Arrays.sort(ch2);
        String nstr1 = new String(ch1);
        String nstr2 = new String(ch2);
        if(nstr1.equals(nstr2)){
            System.out.println("the string  is anagram");
        }else{
            System.out.println("the string is not anagram");
        }
    }
}




import java.util.*;
public class MockTest{
    public static void main(String args []){
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the n");
        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            sum = sum + n;
          
        }
        System.out.println(sum);
    }
}

*/

import java.util.*;
public class MockTest{
public static void main(String args[]){

    String str = "programming";
    int count = 0;
  
    for(int i=0;i<str.length();i++){
      char  ch = str.charAt(i);
        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
            count = count + 1;

        }


    }
    System.out.println(count);



}

}