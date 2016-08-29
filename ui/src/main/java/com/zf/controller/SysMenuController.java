package com.zf.controller;

import com.zf.common.ICommonController;
import com.zf.common.ICommonService;
import com.zf.entity.SysMenu;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.List;

/**
 * SysMenuController
 *
 * @author zf
 * @date 16/8/28
 */

public class  SysMenuController<SysMenu> implements ICommonController<SysMenu>{

    @Resource(name = "sysMenuService")
    ICommonService<SysMenu> iCommonService;

    @Override
    @RequestMapping(value = "/save")
    public SysMenu save(SysMenu entity) throws Exception {
        return iCommonService.save(entity);
    }

    @Override
    @RequestMapping(value = "/delete")
    public void delete(SysMenu entity) throws Exception {
        iCommonService.delete(entity);
    }

    @Override
    @RequestMapping(value = "/findBySample")
    public SysMenu findBySample(SysMenu sample) {
        return iCommonService.findBySample(sample);
    }

    @Override
    @RequestMapping(value = "/findAll")
    public Page<SysMenu> findAll(SysMenu sample, PageRequest pageRequest) {
        return iCommonService.findAll(sample,pageRequest);
    }
}
