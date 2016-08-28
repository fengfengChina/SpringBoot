package com.zf.common;


import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

import java.util.List;

/**
 * ICommonService
 *
 * @author zf
 * @date 16/7/4
 */
public interface ICommonService<T> {
    T save(T entity) throws Exception;
    void delete(Long id) throws Exception;
    void delete(T entity) throws Exception;
    T findById(Long id);
    T findBySample(T sample);
    List<T> findAll();
    List<T> findAll(T sample);
    Page<T> findAll(PageRequest pageRequest);
    Page<T> findAll(T sample, PageRequest pageRequest);
}

