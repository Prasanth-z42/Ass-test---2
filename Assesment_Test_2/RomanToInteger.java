package com.assesment_test.test_2;
import java.util.Scanner;
public class RomanToInteger {
    static int romanToInt(String str){
        int res = 0;
        int[] roman = new int[100];
        roman['I'] = 1;
        roman['V'] = 5;
        roman['X'] = 10;
        roman['L'] = 50;
        roman['C'] = 100;
        roman['D'] = 500;
        roman['M'] = 1000;
        int i;
        for(i = 0; i<str.length()-1; i++){
            if(roman[str.charAt(i)] < roman[str.charAt(i+1)])
                res -= roman[str.charAt(i)];
            else
                res += roman[str.charAt(i)];
        }
        res += roman[str.charAt(i)];
        return res;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Roman");
        String roman = sc.next();
        System.out.println(romanToInt(roman));
    }
}
