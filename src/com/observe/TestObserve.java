package com.observe;

/**
 * @author: yuanbing
 * @created time: 2020/9/9 00:03
 * @description:
 */

class TestObserve {

    public static void main(String[] args) {
        Test test = new Test("yuanbing", "1234");
        System.out.println("0--->"+test);
        TestO testO = new TestO();
        testO.test(test);
        test = new Test("yuanyuan", "1111");
        System.out.println("1--->"+test);
    }
}
