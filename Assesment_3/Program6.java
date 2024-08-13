package com.assesment_test_3;
import java.util.Arrays;
import java.util.Scanner;
public class Problem6 {
    static void moveZeros(int[] arr){
        for(int i = 0; i<arr.length; i++){
            if(arr[i] == 0) {
                int j;
                for (j = arr.length - 1; j > i; j--) {
                    arr[j] = arr[j - 1];
                }
                arr[j] = 0;
                i++;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size");
        int size = sc.nextInt();
        int[] arr = new int[size];
        for(int i = 0; i<size; i++){
            arr[i] = sc.nextInt();
        }
        moveZeros(arr);
    }
}
