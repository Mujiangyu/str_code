package com.niit.string;

import java.util.ResourceBundle;
import java.util.Scanner;

public class StringDemo10 {
    public static void main(String[] args) {
        System.out.println("输入一个字符串");
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        String[] str1 = {"cnm","sb","tmd","qsb","nmsl"};

        for (int i = 0; i < str1.length; i++) {
            str = str.replace(str1[i],"***");
        }
        System.out.println(str);
    }
}
