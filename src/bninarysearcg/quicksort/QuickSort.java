package bninarysearcg.quicksort;

import java.util.Arrays;

public class QuickSort {

    public static void main(String[] args) {
        int arr[]={2,3,2,5,6,7,10,12};
        int begin=0;
        int end=arr.length-1;
        quickSort(arr,begin,end);
        System.out.println(Arrays.toString(arr));

        quickSort_for_loop(arr,begin,end);
        System.out.println(Arrays.toString(arr));


    }
   public static void quickSort(int arr[],int begin,int end) {
       int pivotIndex;
       if (begin < end) {
           pivotIndex = partition(arr, begin, end);
           quickSort(arr, begin, pivotIndex-1);
           quickSort(arr,pivotIndex+1,end);
       }

   }

    private static int partition(int[] arr, int begin, int end) {
        int pivot=arr[end];
        int index=begin-1;

        for (int i=begin;i<end-1;i++){
            if (arr[i]==pivot){
                index++;
//                int temp=arr[index];
//                arr[index]=arr[i];
//                arr[i]=temp;

                arr[index]=arr[index]+arr[i];
                arr[i]=arr[index]-arr[i];
                arr[index]=arr[index]-arr[i];

            }
        }
//        int temp=arr[index+1];
//        arr[index+1]=arr[end];
//        arr[end]=temp;

        arr[index+1]=arr[index+1]+arr[end];
        arr[end]=arr[index+1]-arr[end];
        arr[index+1]=arr[index+1]-arr[end];
        return index+1;
    }


    public static void quickSort_for_loop(int arr[],int begin,int end) {
        int pivotIndex;
        if (begin < end) {
            pivotIndex = partition2(arr, begin, end);
            quickSort(arr, begin, pivotIndex-1);
            quickSort(arr,pivotIndex+1,end);
        }

    }

    private static int partition2(int[] arr, int begin, int end) {
        int pivot=arr[end];
        int i=begin;


        for ( ;i<begin-1;i++){
            for (int j=begin;j<end-1;j++){
                if(arr[j]<pivot) {
                    arr[i] = arr[i] + arr[j];
                    arr[j] = arr[i] - arr[j];
                    arr[i] = arr[i] - arr[j];
                }
            }
            arr[i+1]=arr[i+1]+arr[end];
            arr[end]=arr[i+1]-arr[end];
            arr[i+1]=arr[i+1]-arr[end];
        }

        return i;
    }
}
