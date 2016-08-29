package com.zf.common;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

import java.util.List;

/**
 * ICommonController
 *
 * @author zf
 * @date 16/8/28
 */
public interface  ICommonController<T> {
    T save(T entity) throws Exception;
    void delete(T entity) throws Exception;
    T findBySample(T sample);
    Page<T> findAll(T sample, PageRequest pageRequest);
}
