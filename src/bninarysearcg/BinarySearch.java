package bninarysearcg;

import java.util.*;

public class BinarySearch {
    public static void main(String[] args) {

        int arr[]={2,1,4,5,12,20,8,9,10};
        int start=0;
        int end=arr.length-1;
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter the value to be search : ");
        int value=sc.nextInt();
//        BinarySearch.binarySearch_While_Loop(arr,start,end,value);
//        binarySearch_For_Loop(arr,start,end,value);

//        binarySearch_TreeSet(arr,start,end,value);
        binarySearch_Collections(arr,value);

    }
    public static void binarySearch_While_Loop(int arr[],int start,int end,int value){

        int flag=0;
        while (start<=end){
            int middle=(start+end)/2;
            if (value==arr[middle]){
                System.out.println(value+" found on the index : "+middle);
                flag=1;
                break;
            } else if (value>arr[middle]) {
                start=middle+1;
            }else if(value<arr[middle]) {
                end=middle-1;
            }
            else {
                System.out.println("Entered value is not found..!");
            }
        }

    }

    public static void binarySearch_For_Loop(int arr[],int start,int end,int value){
        for (int i=0;i<arr.length;i++){
            int middle=(end-start)/2;
            if (arr[i]==value){
                System.out.println(value+" found at index : "+arr[i]);
            }else if (arr[middle]<value){
                start=middle+1;
            } else if (arr[middle]>value) {
                end=middle-1;
            }else {
                System.out.println("Not Found..!");
            }
        }
    }
    public static void binarySearch_TreeSet(int arr[],int start,int end,int value){
        TreeSet ts= new TreeSet();
        ArrayList al=new ArrayList();

        for (int a:arr){
            al.add(a);
        }
        System.out.println(al);
        if(al.contains(value)){
            System.out.println(value+" Contains in index of "+al.indexOf(value));
        }
    }
    public static void binarySearch_Collections(int arr[],int value){
        int i = Arrays.binarySearch(arr, value);
        System.out.println(i);

        ArrayList al=new ArrayList();
        for (int a:arr
             ) {
            al.add(a);
        }
        System.out.println(al);
        int index = Collections.binarySearch(al, value);
        System.out.println(index);
    }
}
