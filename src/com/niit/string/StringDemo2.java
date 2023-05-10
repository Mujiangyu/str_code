package com.niit.string;

import java.util.Scanner;

public class StringDemo2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("输入一个字符串");
        String s1 = sc.next();//通过对原码的查找，发现键盘录入的字符串，实际上时new出来的，其地址不在字符串池中，而在堆中

        String s2 = "abc";

        System.out.println(s1 == s2);
    }
}
