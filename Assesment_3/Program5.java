package com.assesment_test_3;
import java.util.Scanner;
public class Problem5 {
    static boolean equal(int[] arr){
        int xor = 0;
        for(int i = 0; i<arr.length; i++){
            xor ^= arr[i];
        }
        if(xor == 0)
            return true;
        return false;
    }
    /*static boolean equalPair(int[] arr){
        int[] a = new int[500];
        for(int i = 0; i<arr.length; i++){
            a[arr[i]]++;
        }
        for(int i = 0; i<arr.length; i++){
            if(a[arr[i]] % 2 != 0)
                return false;
        }
        return true;
    }*/
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array");
        int size = sc.nextInt();
        int[] arr = new int[size];
        for(int i = 0; i<size; i++){
            arr[i] = sc.nextInt();
        }
       // System.out.println(equalPair(arr));
        System.out.println(equal(arr));
    }
}
