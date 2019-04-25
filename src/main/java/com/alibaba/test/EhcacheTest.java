package com.alibaba.test;

import net.sf.ehcache.Cache;
import net.sf.ehcache.CacheManager;
import net.sf.ehcache.Element;

public class EhcacheTest {
    public static void main(String[] args) {
        //  获取一个缓存管理器实例
        CacheManager cacheManager = CacheManager.getInstance();
        //  往缓存管理器中添加一个缓存对象
        cacheManager.addCache("userCache");

        //  获取缓存对象
        Cache userCache = cacheManager.getCache("userCache");
        //  将数据添加添加到缓存空间中
        Element element = new Element("01","zhangsan");
        userCache.put(element);
        //  hitCount：当前元素的查询次数  数据排名
        Element element1 = userCache.get("01");
        System.out.println(element1);
        // 关闭缓存管理器
        cacheManager.shutdown();


    }
}
