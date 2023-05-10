package com.niit.test;

import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        //校验字符串中是否含有非法字符（非数字）
        System.out.println("请输入数字字符串");
        String num = "";
        while (true) {
            num = sc.next();
            boolean flag = checkNumber(num);
            if (flag) {
                if (num.length() <= 9)
                    break;
                else {
                    System.out.println("长度不合法，请重新输入");
                }
            } else {
                System.out.println("输入不合法，请重新输入");
            }
        }
        //将内容转换成罗马数字
        String result = change(num);
        System.out.println(result);
    }

    public static boolean checkNumber(String str) {
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c < '0' || c > '9') {
                return false;
            }
        }
        return true;
    }

    //查表法，产生对应关系
    public static String change(String str) {
        String[] romanNumber = {" ", "Ⅰ", "Ⅱ", "Ⅲ", "Ⅳ", "Ⅴ", "Ⅵ", "Ⅶ", "Ⅷ", "Ⅸ",};
        String newRoma = "";
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            int index = c - 48;
            newRoma = sb.append(romanNumber[index]).toString();
        }
        return newRoma;
    }
}
