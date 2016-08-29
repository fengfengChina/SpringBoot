package com.zf.controller;

import com.zf.common.ICommonController;
import com.zf.common.ICommonService;
import com.zf.entity.SysRole;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * SysRoleController
 *
 * @author zf
 * @date 16/8/28
 */
@RestController
@RequestMapping(value = "/sysRole")
public class SysRoleController implements ICommonController<SysRole> {

    @Resource(name = "sysRoleService")
    ICommonService<SysRole> iCommonService;

    @Override
    @RequestMapping(value = "/save")
    public SysRole save(SysRole entity) throws Exception {
        return iCommonService.save(entity);
    }

    @Override
    @RequestMapping(value = "/delete")
    public void delete(SysRole entity) throws Exception {
        iCommonService.delete(entity);
    }

    @Override
    @RequestMapping(value = "/findBySample")
    public SysRole findBySample(SysRole sample) {
        return iCommonService.findBySample(sample);
    }

    @Override
    @RequestMapping(value = "/findAll")
    public Page<SysRole> findAll(SysRole sample, PageRequest pageRequest) {
        return iCommonService.findAll(sample,pageRequest);
    }
}
