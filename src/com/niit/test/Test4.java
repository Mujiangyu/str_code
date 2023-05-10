package com.niit.test;

public class Test4 {
    public static void main(String[] args) {
        String str = "see you tomorrow";
        int num = lastWordLength(str);
        System.out.println(num);
    }

    public static int lastWordLength(String str) {
        int count = 0;
        for (int i = str.length() - 1; i > 0; i--) {
            char c = str.charAt(i);
            if (c == ' ') {
                break;
            }
            count++;
        }
        return count;
    }

}
