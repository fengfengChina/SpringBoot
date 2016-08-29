package com.zf.service;

import com.zf.common.ICommonService;
import com.zf.entity.SysMenu;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * SysMenuService
 *
 * @author zf
 * @date 16/8/28
 */
@Service
public class SysMenuService implements ICommonService<SysMenu>{

    @Override
    public SysMenu save(SysMenu entity) throws Exception {
        return null;
    }

    @Override
    public void delete(Long id) throws Exception {

    }

    @Override
    public void delete(SysMenu entity) throws Exception {

    }

    @Override
    public SysMenu findById(Long id) {
        return null;
    }

    @Override
    public SysMenu findBySample(SysMenu sample) {
        return null;
    }

    @Override
    public List<SysMenu> findAll() {
        return null;
    }

    @Override
    public List<SysMenu> findAll(SysMenu sample) {
        return null;
    }

    @Override
    public Page<SysMenu> findAll(PageRequest pageRequest) {
        return null;
    }

    @Override
    public Page<SysMenu> findAll(SysMenu sample, PageRequest pageRequest) {
        return null;
    }
}
