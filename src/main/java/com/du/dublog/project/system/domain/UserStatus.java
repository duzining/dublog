package com.du.dublog.project.system.domain;
/**
 * @Author : Duzining
 * @Description :用户状态
 * @Date : 2019/5/29 17:05
 * @Version : 1.0
 * @param null
 * @Return
 */
public enum UserStatus {
    /**
     * 正常状态
     */
    OK("0", "正常"),
    /**
     * 停用状态
     */
    DISABLE("1", "停用"),
    /**
     * 已删除状态
     */
    DELETED("2", "删除");

    private final String code;
    private final String info;

    UserStatus(String code, String info) {
        this.code = code;
        this.info = info;
    }

    public String getCode() {
        return code;
    }

    public String getInfo() {
        return info;
    }
}
