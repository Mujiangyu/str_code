package com.niit.string;

public class StringDemo1 {
    public static void main(String[] args) {
        //直接赋值发创建字符串对象
        String s1 = "abc";
        System.out.println(s1);

        //使用new的方式来创建一个字符串对象
        //空参构造，获取一个空白的字符串对象
        String s2 = new String();
        System.out.println(s2);

        //传递一个字符串，根据传递到字符串内容，创建一个字符串对象
        String s3 = new String("abc");
        System.out.println(s3);

        //传递一个字符数组，创建一个字符串对象
        //应用场景：修改字符串
        char[] chs = {'a', 'b', 'c'};
        String s4 = new String(chs);
        System.out.println(s4);

        //传递一个字节数组，创建一个字符串对象
        //应用场景：网络传输过程中的字节信息转换成字符串
        byte[] bytes = {97,98,99,100};
        String s5 = new String(bytes);//将获取到的数据转换成ascii码在进行拼接f
        System.out.println(s5);
    }
}
