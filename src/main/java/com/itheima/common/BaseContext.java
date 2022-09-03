package com.itheima.common;

/**
 * 用于保存和获取当前线程的id
 *
 * @author asus
 * @date 2022/09/02
 */
public class BaseContext {
    private static ThreadLocal<Long> threadLocal = new ThreadLocal<>();

    public static void setCurrentId(Long id){
        threadLocal.set(id);
    }

    public static Long getCurrentId(){
        return threadLocal.get();
    }
}
