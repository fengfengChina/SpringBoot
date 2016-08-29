package com.zf.service;

import com.zf.common.ICommonService;
import com.zf.entity.SysUser;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * SysUserService
 *
 * @author zf
 * @date 16/8/28
 */
@Service
public class SysUserService implements ICommonService<SysUser> {
    @Override
    public SysUser save(SysUser entity) throws Exception {
        return null;
    }

    @Override
    public void delete(Long id) throws Exception {

    }

    @Override
    public void delete(SysUser entity) throws Exception {

    }

    @Override
    public SysUser findById(Long id) {
        return null;
    }

    @Override
    public SysUser findBySample(SysUser sample) {
        return null;
    }

    @Override
    public List<SysUser> findAll() {
        return null;
    }

    @Override
    public List<SysUser> findAll(SysUser sample) {
        return null;
    }

    @Override
    public Page<SysUser> findAll(PageRequest pageRequest) {
        return null;
    }

    @Override
    public Page<SysUser> findAll(SysUser sample, PageRequest pageRequest) {
        return null;
    }
}
