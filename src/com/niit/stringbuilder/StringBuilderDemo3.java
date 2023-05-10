package com.niit.stringbuilder;

import java.util.Scanner;

public class StringBuilderDemo3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("输入一个字符串");
        String str = sc.next();

        //使用stringbuilder的场景
        //1.拼接字符串
        //2.倒转字符串

        String s = new StringBuilder().append(str).reverse().toString();
        System.out.println(s);
        if(str.equals(s)){
            System.out.println("当前字符串是对称的");
        }else {
            System.out.println("当前字符串不是对称的");
        }
    }

}
