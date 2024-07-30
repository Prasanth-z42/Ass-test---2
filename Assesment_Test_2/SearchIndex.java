package com.assesment_test.test_2;
import java.util.Scanner;
import java.util.Arrays;
public class SearchIndex {
    static boolean isCheck(char[] cArr, char ch){
        for(int i = 0; i<cArr.length; i++){
            if(cArr[i] != '*') {
                if (cArr[i] == ch) {
                    cArr[i] = '*';
                    return true;
                }
            }
        }
        return false;
    }
    static void findIndex(String str, String[] words){
        String fLetters = firstCharacters(words);
        char[] ch = fLetters.toCharArray();
        int[] arr = new int[100];
        int k = 0;
        for(int i = 0; i<str.length(); i++){
            if(isCheck(ch,str.charAt(i))){
                int count = 0;
                int j = i+words[0].length();
                inner:
                while(j<str.length() && count < words.length){
                    if(!isCheck(ch,str.charAt(j)))
                        break inner;
                    j += words[0].length();
                    count++;
                }
                if(count == words.length-1)
                    arr[k++] = i;
            }
            ch = fLetters.toCharArray();
        }
        arr = Arrays.copyOfRange(arr,0,k);
        System.out.println(Arrays.toString(arr));
    }
    static String firstCharacters(String[] arr) {
        String temp = "";
        for (int i = 0; i < arr.length; i++) {
            temp += arr[i].charAt(0);
        }
        return temp;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String");
        String input = sc.next();
        System.out.println("Enter the size of the words array");
        int size = sc.nextInt();
        String[] words = new String[size];
        System.out.println("Enter the words");
        for(int i = 0; i<size; i++){
            words[i] = sc.next();
        }
        findIndex(input, words);
    }
}
