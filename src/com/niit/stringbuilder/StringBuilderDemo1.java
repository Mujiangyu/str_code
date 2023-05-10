package com.niit.stringbuilder;

public class StringBuilderDemo1 {
    public static void main(String[] args) {
        //创建stringbuilder对象
        StringBuilder sb = new StringBuilder("abc");

        //调用成员方法

        //sb.append()字符串添加
//        sb.append(1);
//        sb.append(2.3);
//        sb.append(true);

        //sb.reverse()字符串反转
//        sb.reverse();
//        System.out.println(sb);

        //求字符串的长度，sb.length()
//        int count = sb.length();
//        System.out.println(count);

        //sb.toString()将stringbuilder对象转换为string对象
        sb.append("aaa");
        sb.append("bbb");
        sb.append("ccc");
        sb.append("ddd");
        //sb只是一个stringbuilder容器对象，用来帮助我们操作字符串，并不是一个字符串对象
        String str = sb.toString();

        //stringbuilder是java已经写好的类，java底层对其做了一些处理，所以打印对象名控制台显示的是对象的属性值而不是地址值
        //System.out.println(sb);

    }
}
