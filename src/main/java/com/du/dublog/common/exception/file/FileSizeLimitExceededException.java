package com.du.dublog.common.exception.file;
/**
 * @Author : Duzining
 * @Description :文件名大小限制异常
 * @Date : 2019/5/27 17:21
 * @Version : 1.0
 * @param null
 * @Return
 */
public class FileSizeLimitExceededException extends FileException{
    private static final long serialVersionUID = 1L;

    public FileSizeLimitExceededException(long defaultMaxSize) {
        super("upload.exceed.maxSize", new Object[]{defaultMaxSize});
    }
}
