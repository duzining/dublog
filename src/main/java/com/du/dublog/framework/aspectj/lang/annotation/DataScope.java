package com.du.dublog.framework.aspectj.lang.annotation;

import java.lang.annotation.*;

/**
 * @Author : Duzining
 * @Description :数据权限过滤注解
 * @Date : 2019/5/30 16:06
 * @Version : 1.0
 * @param null
 * @Return
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@Documented
public @interface DataScope {
    /**
     * 表的别名
     */
    String tableAlias() default "";
}
