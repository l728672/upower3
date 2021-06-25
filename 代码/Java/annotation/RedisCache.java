package com.exam.annotation;
/*
 * @Description:
 * @Author: 1013962464521.com
 * @Date: 2020/4/6
 * @param null: redis缓存注解
 * @return: null
 **/
import java.lang.annotation.*;
import java.util.concurrent.TimeUnit;

/**
 * Redis缓存自定义注解
 *
 */
@Target({ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Inherited
public @interface RedisCache {

    /**
     * 业务的名称
     */
    String value() default "";

    /**
     * redis缓存的Key（默认类名-方法名-自定义key）
     */
    String key() default "";

    /**
     * 是否刷新缓存，默认false
     */
    boolean flush() default false;

    /**
     * 缓存失效时间，默认30
     */
    long expire() default 30L;

    /**
     * 缓存时间单位，默认天
     */
    TimeUnit unit() default TimeUnit.DAYS;
}
