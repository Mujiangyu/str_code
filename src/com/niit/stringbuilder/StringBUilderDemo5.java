package com.niit.stringbuilder;

public class StringBUilderDemo5 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();

        sb.append("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        System.out.println(sb.capacity());//stringbuilder的容量
        System.out.println(sb.length());//sringbuilder的实际长度
    }
}
