package com.niit.stringjoiner;

import java.util.StringJoiner;

public class StringJoinerDemo {
    public static void main(String[] args) {
        //用于高效的拼接字符串

        //构造方法
        //1.public StringJoiner(间隔符) 创建一个sj对象，指定拼接是的间隔符号
        //2.public StringJoiner(间隔符,开始符号,结束符号) 创建一个sj对象，指定拼接是的间隔符号、开始符号、结束符号
        StringJoiner sj = new StringJoiner("---");
        //添加元素
        sj.add("aaa").add("bbb").add("ccc");
        System.out.println(sj);
        //sj.add() 添加数据，并返回对象本身
        //sj.length() 返回长度
        //是sj.tostring 返回一个字符串(该字符串就是拼接后的结果)

    }
}
