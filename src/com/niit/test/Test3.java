package com.niit.test;

public class Test3 {
    public static void main(String[] args) {
        String num1 = "1234";
        String num2 = "12345";

        int n1 = change(num1);
        int n2 = change(num2);

        System.out.println(n1 * n2);

    }
    public static int change(String str){
        int num = 0;
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            int tmp = c - 48;
            num = num * 10 + tmp;
        }
        return num;
    }
}
