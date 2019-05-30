package com.du.dublog.framework.shiro.service;

import com.du.dublog.project.system.domain.User;
import org.apache.shiro.cache.Cache;
import org.apache.shiro.cache.CacheManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @Author : Duzining
 * @Description :登录密码方法
 * @Date : 2019/5/30 17:37
 * @Version : 1.0
 * @param null
 * @Return
 */
@Component
public class PasswordService {
    @Autowired
    private CacheManager cacheManager;

    private Cache<String,AtomicInteger> loginRecordCache;

    @Value(value = "${user.password.maxRetryCount}")
    private String maxRetryCount;

    @PostConstruct
    public void init(){
        loginRecordCache = cacheManager.getCache("loginRecordCache");
    }

    public void validate(User user,String password){
        String loginName = user.getLoginName();

        AtomicInteger retryCount  = loginRecordCache.get(loginName);

        if (retryCount ==null){
            retryCount = new AtomicInteger(0);
            loginRecordCache.put(loginName,retryCount);
        }
    }
}
