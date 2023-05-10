package com.niit.string;

import java.util.Scanner;

public class StringDemo6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串");
        String str = sc.next();
        String str1 = reverseString(str);
        System.out.println("反转后的字符串为 "+ str1);
    }
    public static String reverseString(String str){
        String result = "";
        //倒着遍历字符串
        for (int i = str.length() - 1; i >= 0; i--) {
            char c = str.charAt(i);
            result += c;
        }
        return result;
    }
}
