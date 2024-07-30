package com.assesment_test.test_2;
import java.util.Scanner;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
public class GenerateParenthesis {
    static void backTrack(String str, int open, int close, int max){
        if(str.length() == max*2){
            System.out.print(str + " ");
            return;
        }
        if(open < max)
            backTrack(str+"(",open+1,close,max);
        if(close < open)
            backTrack(str+")",open,close+1,max);
    }
    static void generateParenthesis(int n){
        backTrack("",0,0,n);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number of Combinations");
        int n = sc.nextInt();

        generateParenthesis(n);
    }
}
