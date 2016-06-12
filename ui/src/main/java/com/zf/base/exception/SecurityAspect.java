package com.zf.base.exception;

import com.zf.base.IgnoreSecurity;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

import javax.servlet.http.HttpServletRequest;
import java.lang.reflect.Method;

/**
 * SecurityAspect
 *
 * @author zf
 * @date 16/3/21
 */
//@Aspect
//@Component("securityAspect")
public class SecurityAspect {

    private static final String DEFAULT_TOKEN_NAME = "Token";

    private String tokenName;


    public void setTokenName(String tokenName) {
        if (StringUtils.isEmpty(tokenName)) {
            tokenName = DEFAULT_TOKEN_NAME;
        }
        this.tokenName = tokenName;
    }


}
