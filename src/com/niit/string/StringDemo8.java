package com.niit.string;

import java.util.Scanner;

public class StringDemo8 {
    public static void main(String[] args) {
        //获取一个手机号码，并进行校验
        Scanner sc = new Scanner(System.in);
        String phoneNumber = "";
        while (true) {
            System.out.println("输入手机号码");
            phoneNumber = sc.next();
            if(phoneNumber.length() != 11){
                System.out.println("手机号不合法，请重新输入");
            }else {
                break;
            }
        }
        //利用string.substring()方法，截取手机号码的前三位和后四位
        String arr1 = phoneNumber.substring(0,3);
        String arr2 = phoneNumber.substring(7);

        String result = arr1 + "****" + arr2;

        System.out.println("处理后的手机号码是 \n"+result);
    }
}
