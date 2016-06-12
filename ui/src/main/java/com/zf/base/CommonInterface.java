package com.zf.base;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;

import java.util.List;

/**
 * Created by kevinzou on 3/25/16.
 * CommonInterface
 */
public interface CommonInterface<T> {
    T findById(Integer id);
    T findBySample(T sample);
    List<T> findAll(Sort sort);
    List<T> findBySample(T sample, Sort sort);
    Page<T> findBySample(T sample, PageRequest pageRequest);
}
