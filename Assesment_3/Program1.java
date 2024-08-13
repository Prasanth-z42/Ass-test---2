package com.assesment_test_3;
import java.util.Scanner;
import java.util.Arrays;
public class Problem1 {
    static int maximumSubArrayElement(int[] arr, int start, int end){
        int max = arr[start];
        for(int i = start; i<end; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }
    static void findMaxSubArray(int[] arr, int size, int k){
        int[] max = new int[arr.length];
        int ind = 0;
        for(int i = 0; i+k-1<arr.length; i++){
            max[ind++] = maximumSubArrayElement(arr,i,i+k);
        }
        max = Arrays.copyOfRange(max,0,ind);
        System.out.println(Arrays.toString(max));
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the Array Elements");
        for(int i = 0; i<size; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the k value");
        int k = sc.nextInt();
        findMaxSubArray(arr,size,k);
    }
}
