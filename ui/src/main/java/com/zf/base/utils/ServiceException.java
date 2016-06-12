package com.zf.base.utils;

/**
 * ServiceException
 *
 * @author zf
 * @date 16/3/21
 */
public class ServiceException extends RuntimeException {

    private static final long serialVersionUID = 1389958090308317369L;

    public ServiceException() {
        super();
    }

    public ServiceException(String msg, Throwable clause) {
        super(msg, clause);
    }

    public ServiceException(String msg) {
        super(msg);
    }

    public ServiceException(Throwable clause) {
        super(clause);
    }
}
