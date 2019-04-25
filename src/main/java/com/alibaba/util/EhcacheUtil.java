package com.alibaba.util;

import net.sf.ehcache.Cache;
import net.sf.ehcache.CacheManager;
import net.sf.ehcache.Element;
import net.sf.ehcache.Status;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author: pengyl
 * @Description:
 * @Date: createDate in 20:15 2018/4/10
 */
public class EhcacheUtil {
    private final CacheManager cacheManager = CacheManager.newInstance();
    private Cache cache;
    private String cacheName = "defaultCache";
    /**
     * 初始化缓存空间
     */
    public EhcacheUtil(){
        cache = cacheManager.getCache(this.cacheName);
        if(cache==null){
            cacheManager.addCache(this.cacheName);
            cache = cacheManager.getCache(this.cacheName);
        }
    }
    /**
     * 指定缓存空间
     * @param cacheName
     */
    public EhcacheUtil(String cacheName) {
        cache = cacheManager.getCache(cacheName);
        if (cache == null) {
            cacheManager.addCache(cacheName);
            cache = cacheManager.getCache(cacheName);
        }
    }

	/**
	 * 将数据放入缓存中
	 * @param key
	 * @param value
	 */
    public  void putObject(Object key,Object value){
        Status status = cache.getStatus();
        if(status.equals(Status.STATUS_ALIVE)){
            Element element = new Element(key,value);
            cache.put(element);
        }else{
            throw new RuntimeException("cache is ："+Status.STATUS_SHUTDOWN.toString());
        }

    }
   /**
    * 跟据key 返回对应数据
    * @param key
    * @return
    */
    public Object getObject(Object key){
        Status status = cache.getStatus();
        if(status.equals(Status.STATUS_ALIVE)){
            if(cache.get(key)!=null){
            return  cache.get(key).getObjectValue();
            }
            return null;
        }else{
            throw new RuntimeException("cache is锛�"+Status.STATUS_SHUTDOWN.toString());
        }
    }
    /**
     * 根据key 删除数据
     * @param key
     */
    public void  removeObject(Object key){
        Status status = cache.getStatus();
        if(status.equals(Status.STATUS_ALIVE)){
            cache.remove(key);
        }else{
            throw new RuntimeException("cache is锛�"+Status.STATUS_SHUTDOWN.toString());
        }
    }
    /**
     * 根据缓存空间名称，清除缓存空间
     * @param cacheName
     */
    public void removeCache(String cacheName){
        cacheManager.removeCache(cacheName);
    }
    /**
     * 根据缓存空间名称，清除缓存空间(删除默认缓存空间)
     */
    public void removeCache(){
        cacheManager.removeCache(this.cacheName);
    }
    /**
     * 关闭缓存管理器
     */
    public void shutdown(){
        cacheManager.shutdown();
    }



}
