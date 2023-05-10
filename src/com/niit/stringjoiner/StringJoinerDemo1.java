package com.niit.stringjoiner;

import java.util.StringJoiner;

public class StringJoinerDemo1 {
    public static void main(String[] args) {
        //创建对象，指定拼接时的开始和结束标记
        StringJoiner sj = new StringJoiner("---","[","]");

        sj.add("aaa").add("bbb").add("ccc");

        int len = sj.length();//所有字符的总个数

        String s = sj.toString();


        System.out.println(s);
    }
}
