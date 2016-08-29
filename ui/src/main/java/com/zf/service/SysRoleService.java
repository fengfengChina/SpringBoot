package com.zf.service;

import com.zf.common.ICommonService;
import com.zf.entity.SysRole;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * SysRoleService
 *
 * @author zf
 * @date 16/8/28
 */
@Service
public class SysRoleService implements ICommonService<SysRole>{
    @Override
    public SysRole save(SysRole entity) throws Exception {
        return null;
    }

    @Override
    public void delete(Long id) throws Exception {

    }

    @Override
    public void delete(SysRole entity) throws Exception {

    }

    @Override
    public SysRole findById(Long id) {
        return null;
    }

    @Override
    public SysRole findBySample(SysRole sample) {
        return null;
    }

    @Override
    public List<SysRole> findAll() {
        return null;
    }

    @Override
    public List<SysRole> findAll(SysRole sample) {
        return null;
    }

    @Override
    public Page<SysRole> findAll(PageRequest pageRequest) {
        return null;
    }

    @Override
    public Page<SysRole> findAll(SysRole sample, PageRequest pageRequest) {
        return null;
    }
}
