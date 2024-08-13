package com.assesment_test_3;
import java.util.Scanner;
public class Problem3 {
    static int countElement(int n, int t){
        int count = 0;
        while(n > t){
            count++;
            n -= t;
        }
        return count + 1;
    }
    static void findCounts(int[] arr, int t){
        int count = 0;
        for(int i = 0; i<arr.length; i++){
            count += countElement(arr[i],t);
        }
        System.out.println(count);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array");
        int size = sc.nextInt();
        int[] arr = new int[size];
        for(int i = 0; i<size; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter threshold");
        int t = sc.nextInt();
        findCounts(arr,t);
    }
}
