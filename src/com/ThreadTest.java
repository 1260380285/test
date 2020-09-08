package com;

/**
 * @author: yuanbing
 * @created time: 2020/8/9 12:45
 * @description:
 */

class ThreadTest {
    public static void main(String[] args) {
        ThreadLocal threadLocal=new ThreadLocal();
        threadLocal.set("3");
        ThreadLocal threadLocal1=new ThreadLocal();
        threadLocal1.set("44");
        System.out.println(threadLocal.get());
        System.out.println(threadLocal1.get());
        float weigjt=12.3f;
        String s=String.valueOf(weigjt);
        System.out.println(s);
    }
}
