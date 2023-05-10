package com.niit.string;

public class StringDemo9 {
    public static void main(String[] args) {
        //定义一个身份证给信息的字符串
        String id = "34122520020625043X";

        //获取出生年月日
        String year = id.substring(6,10);
        String month = id.substring(10,12);
        String day = id.substring(12,14);

        System.out.println("人物信息为");
        System.out.println("出生年月日："+year +month+day);

        //获取性别
        char gender = id.charAt(16);
        //将字符转换为数字，利用ascii码表、
        //'0'-->48
        //'1'-->49
        //'2'-->50
        //'3'-->51
        //'4'-->52
        //'5'-->53
        //'6'-->54
        //'7'-->55
        //'8'-->56
        //'9'-->57
        int num = gender - 48;

        if(num % 2 ==0){
            System.out.println("性别为：女");
        }else {
            System.out.println("性别为：男");
        }
    }
}
