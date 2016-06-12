package com.zf.base;

import java.util.List;

/**
 * BaseService
 *
 * @author zf
 * @date 16/3/19
 */
public interface BaseService<T>  {
    /**
     * 查询全部实体
     * @return
     */
    List<T> findAll();

    /**
     * 保存对象
     * @param t
     * @return
     */
    Boolean save(T t);

    /**
     * 更新对象
     * @param t
     * @return
     */
    Boolean update(T t);

    /**
     * 删除某一个对象
     * @param id
     * @return
     */
    Boolean delete(Integer id);


}
