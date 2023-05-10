package com.niit.string;

import java.util.Scanner;

public class StringDemo3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("输入一个字符串");
        String str = sc.next();

        //进行遍历
        for (int i = 0; i < str.length(); i++) {
            System.out.print(str.charAt(i)+" ");//str.charAt(i) 获取字符串中索引为i的字符
        }
    }
}
