package com.alibaba.test;

import org.apache.shiro.crypto.hash.Md5Hash;

/**
 * MD5的加密工具类
 */
public class MD5Test {
    public static void main(String[] args) {
        Md5Hash md5Hash = new Md5Hash("123456","OMGG",1024);
        System.out.println(md5Hash);
    }
}
