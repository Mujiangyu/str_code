package com.niit.string;

import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        String username = "root";
        String password = "niit1234";

        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            System.out.println("第" + (i + 1) + "次输入用户名");
            String s = sc.next();
            boolean result = s.equals(username);
            if (result) {
                System.out.println("用户名正确，继续输入密码");
                break;
            } else {
                System.out.println("用户名错误，请重新输入");

            }
        }
        for (int j = 0; j < 3; j++) {
            System.out.println("请输入密码");
            String s1 = sc.next();
            boolean flag = s1.equals(password);
            if (flag) {
                System.out.println("登录成功");
                break;
            } else {
                if(j == 2){
                    System.out.println("账户被锁定");
                }
                System.out.println("密码错误，请重新输入");

            }
        }

    }
}
