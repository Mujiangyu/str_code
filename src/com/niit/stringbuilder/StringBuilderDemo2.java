package com.niit.stringbuilder;

import java.util.Scanner;

public class StringBuilderDemo2 {
    public static void main(String[] args) {
        //链式编程
        //当我们调用一个方法的时候，不需要用变量接受结果，可以继续调用其他方法
        //依赖前一个方法的结果，再去调用其他方法
        int len =  getString().substring(1).replace("A","b").length();
        System.out.println(len);


    }
    public static String getString(){
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串");
        String str = sc.next();
        return str;
    }
}
