package com.assesment_test_3;
public class Problem2 {
    public static void main(String[] args) {
        int n1 = 123;
        int n2 = 13;
        int base = 4;
        int carry = 0;
        int ans = 0;
        while (n1 != 0 || n2 != 0 || carry != 0) {
            int a = 0;
            int b = 0;
            if(n1>0){
                a=n1%10;
                n1/=10;
            }
            if(n2>0){
                b=n2%10;
                n2/=10;
            }
            int sum=a+b+carry;
            if(sum>=base){
                sum=sum%base;
                carry=1;
            }else{
                carry=0;
            }
            ans=(ans*10)+sum;
        }
        while(ans!=0){
            System.out.print(ans%10);
            ans/=10;
        }
    }
}