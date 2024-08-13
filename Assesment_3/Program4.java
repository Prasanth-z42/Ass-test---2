package com.assesment_test_3;
import java.util.Scanner;
public class Problem4 {
    static boolean check(String s1 , String s2){
        int i = 0;
        while(i<s1.length()){
            if(s1.charAt(i) != s2.charAt(i))
                return false;
            i++;
        }
        return true;
    }
    static String substring(String str, int i, int j){
        String temp = "";
        for(int k = i; k<j; k++)
            temp += str.charAt(k)+"";
        return temp;
    }
    static int findIndexOfFirstOccurrance(String str,String sub){
        int n = sub.length();
        for(int i = 0; i+n-1<str.length(); i++){
            if(check(substring(str,i,i+n),sub))
                return i;
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        String str = sc.next();
        System.out.println("Enter the substring");
        String sub = sc.next();
        System.out.println(findIndexOfFirstOccurrance(str,sub));
    }
}
