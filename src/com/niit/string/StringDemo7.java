package com.niit.string;

import java.util.Scanner;

public class StringDemo7 {
    public static void main(String[] args) {
        //输入一个金额，进行校验
        //遍历金额，得到金额的每一位数字，转成中文
        //在大写的金额前面补零
        //定义一个单位数组，遍历插入单位


        //1.输入一个小于七位的整数
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入金额：");
        int smallNum = 0;
        while (true) {
            smallNum = sc.nextInt();
            if (smallNum > 0 && smallNum < 9999999) {
                break;
            } else {
                System.out.println("金额无效");
            }
        }
        //2.定义一个字符串，表示金额的大写
        //遍历输入的每一个数字，并将其转换成大写数字
        String money = "";
        while (true) {
            //从右往左获取数据
            int ge = smallNum % 10;
            String capitalNumber = getCapitalNumber(ge);
            //money + capitalNumber得到的字符串是倒序的
            money = capitalNumber + money;
            smallNum = smallNum / 10;
            if (smallNum == 0) {
                break;
            }
        }

        //3.在数字前面补零到七位
        int count = 7 - money.length();
        for (int i = 0; i < count; i++) {
            money = "零" + money;
        }

        //4.插入金额单位
        //定义一个数组表示单位
        String[] arr = {"佰", "拾", "万", "仟", "佰", "拾", "元"};
        String captitalMoney = "";
        for (int i = 0; i < money.length(); i++) {
            captitalMoney = captitalMoney + money.charAt(i);
            captitalMoney = captitalMoney + arr[i];
        }
        System.out.println("大写金额是：" + captitalMoney);
    }

    public static String getCapitalNumber(int number) {
        String[] arr = {"零", "壹", "贰", "叁", "肆", "伍", "陆", "柒", "捌", "玖"};
        return arr[number];
    }
}
