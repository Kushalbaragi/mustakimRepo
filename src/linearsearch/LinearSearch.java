package linearsearch;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class LinearSearch {

    public static void main(String[] args) {

        int arr[]={1,2,3,7,8,20};
        Scanner sc=new Scanner(System.in);
        int key=sc.nextInt();

        boolean i = linearSearch(arr, key);
        if(i){
            System.out.println(key+" is present in the array..!");
        }
        else {
            System.out.println(key+" is not present in the array..!");
        }
    }

   public static boolean linearSearch(int arr[],int key){

       ArrayList al=new ArrayList();

       for (int a:arr
            ) {
           if (a==key){
               return true;
           }

       }

        return false;
   }
}
