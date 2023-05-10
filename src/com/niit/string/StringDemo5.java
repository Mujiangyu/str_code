package com.niit.string;

public class StringDemo5 {
    public static void main(String[] args) {
        //遍历数组并将其拼接成一个字符串
        int [] arr= {1,2,3,4};
        String str = arrToString(arr);
        System.out.print(str+"]");
    }
    public static String arrToString(int[] num){
        if(num == null){
            return "";
        }
        if(num.length == 0){
            return "[]";
        }
        String result = "[";
        for (int i = 0; i < num.length; i++) {
            if(i == num.length - 1){
                result = result + num[i];
            }else {
                result = result + num[i] + ",";
            }
        }
        return result;
    }
}
