package com.assesment_test.test_2;
import java.util.Scanner;
public class CountAndSay {
    static String findCountAndSay(String digit){
        String str = "";
        int count = 1;
        int number = digit.charAt(0) - '0';
        for(int i = 1; i<digit.length(); i++){
            if(number == digit.charAt(i) - '0')
                count++;
            else{
                str = str + count+""+number;
                count = 1;
                number = digit.charAt(i) - '0';
            }
        }
        str = str + count+""+number;
        return str;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Digit String");
        String digit = sc.next();
        System.out.println(findCountAndSay(digit));
    }
}
