package com.du.dublog.common.exception.file;

import com.du.dublog.common.exception.base.BaseException;

/**
 * @Author : Duzining
 * @Description :文件信息异常类
 * @Date : 2019/5/27 17:14
 * @Version : 1.0
 * @param null
 * @Return
 */
public class FileException extends BaseException{
    private static final long serialVersionUID = 1L;

    public FileException(String code, Object[] args) {
        super("file", code, args, null);
    }

}
