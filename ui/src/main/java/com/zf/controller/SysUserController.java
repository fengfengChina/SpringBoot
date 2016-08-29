package com.zf.controller;

import com.zf.common.ICommonController;
import com.zf.common.ICommonService;
import com.zf.entity.SysUser;
import com.zf.entity.SysUser;
import org.hibernate.annotations.DynamicUpdate;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.List;

/**
 * SysUser
 *
 * @author zf
 * @date 16/8/28
 */
@RequestMapping(value = "/sysUser")
public class SysUserController implements ICommonController<SysUser> {

    @Resource(name = "sysUserService")
    ICommonService<SysUser> iCommonService;

    @Override
    @RequestMapping(value = "/save")
    public SysUser save(SysUser entity) throws Exception {
        return iCommonService.save(entity);
    }

    @Override
    @RequestMapping(value = "/delete")
    public void delete(SysUser entity) throws Exception {
        iCommonService.delete(entity);
    }

    @Override
    @RequestMapping(value = "/findBySample")
    public SysUser findBySample(SysUser sample) {
        return iCommonService.findBySample(sample);
    }


    @Override
    @RequestMapping(value = "/findAll")
    public Page<SysUser> findAll(SysUser sample, PageRequest pageRequest) {
        return iCommonService.findAll(sample,pageRequest);
    }
}
