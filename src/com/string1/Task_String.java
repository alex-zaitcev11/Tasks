package com.string1;

import java.util.Locale;

public class Task_String {
    public static void main(String[] args) {
        String a = "Stephen Edwin King";
        String b = "Stephen Edwin King".toLowerCase(Locale.ROOT);
        System.out.println(a.contentEquals("Walter Winchell"));
        System.out.println(b.contentEquals("stephen edwin king"));
    }
}
