package com.du.dublog.common.exception.file;

import com.du.dublog.common.exception.base.BaseException;

/**
 * @Author : Duzining
 * @Description :文件名称超长限制异常
 * @Date : 2019/5/27 17:16
 * @Version : 1.0
 * @param null
 * @Return
 */
public class FileNameLengthLimitExceededException extends FileException{
    private static final long serialVersionUID = 1L;

    public FileNameLengthLimitExceededException(int defaultFileNameLength) {
        super("upload.filename.exceed.length", new Object[]{defaultFileNameLength});
    }
}
