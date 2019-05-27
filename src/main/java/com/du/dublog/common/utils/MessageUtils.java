package com.du.dublog.common.utils;

import org.springframework.context.MessageSource;

/**
 * @Author : Duzining
 * @Description :获取i18n资源文件
 * @Date : 2019/5/27 17:06
 * @Version : 1.0
 * @param null
 * @Return
 */
public class MessageUtils {
    /**
     * 根据消息键和参数 获取消息 委托给spring messageSource
     *
     * @param code 消息键
     * @param args 参数
     * @return
     */
    public static String message(String code, Object... args) {
        MessageSource messageSource = SpringUtils.getBean(MessageSource.class);
        return messageSource.getMessage(code, args, null);
    }
}
