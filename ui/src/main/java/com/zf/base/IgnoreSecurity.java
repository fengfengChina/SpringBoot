package com.zf.base;

import java.lang.annotation.*;

/**
 * IgnoreSecurity
 *
 * @author zf
 * @date 16/3/21
 */
@Target({ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface IgnoreSecurity {

}
