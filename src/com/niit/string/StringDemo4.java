package com.niit.string;

import java.util.Scanner;

public class StringDemo4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("输入一个字符串");
        String s = sc.next();
        int lowcount = 0;
        int upcount = 0;
        int numcount = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(c >= 'a' && c <= 'z'){
                lowcount++;
            }else if(c >= 'A' && c <= 'Z'){
                upcount++;
            }else if(c >= '0' && c <= '9'){
                numcount++;
            }
        }
        System.out.println("字符串中小写字母有 "+ lowcount+"个");
        System.out.println("字符串中大写字母有 "+ upcount+"个");
        System.out.println("字符串中数字有 "+ numcount+"个");
    }
}
