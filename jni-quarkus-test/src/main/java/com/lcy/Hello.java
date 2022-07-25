package com.lcy;

import java.io.File;

public class Hello {
    static {
//        System.out.println("lib path:" + System.getProperty("java.library.path"));

        String f = "/lib64/libhello.so"; // linux x86_64
        System.out.println(f + " exists? " + new File("/lib64/libhello.so").exists());

        try {
//            System.loadLibrary("hello");
            System.load(f);
            System.out.println("load succeed! " + f);
        } catch (Exception e) {
            System.err.println("load failed! " + f);
            e.printStackTrace();
        }
    }

    static public void main(String[] args) {
        new Hello().sayHello();
    }

    public native void sayHello();
}