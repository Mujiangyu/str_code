package com.niit.test;

import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("输入字符串A");
        String strA = sc.next();
        System.out.println("输入字符串B");
        String strB = sc.next();
        boolean flag = check(strA,strB);
        System.out.println(flag);


    }

    public static boolean check(String str1,String str2){
        for (int i = 0; i < str1.length(); i++) {
            str1 = rotate(str1);
            if(str1.equals(str2)){
                return true;
            }
        }
        return false;
    }

    public static String rotate(String str) {
        StringBuilder sb = new StringBuilder();
        String s1 = str.substring(0, 1);
        String s2 = str.substring(1);
        String result = sb.append(s2).append(s1).toString();
        return result;
    }
}
