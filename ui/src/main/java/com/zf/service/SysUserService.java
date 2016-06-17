package com.zf.service;

import com.zf.dao.SysUserMapper;
import com.zf.domain.SysUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

/**
 * SysUserService
 *
 * @author zf
 * @date 16/6/17
 */
@Service
public class SysUserService {
    @Autowired
    SysUserMapper sysUserMapper;

    @Cacheable(value = "sysUserId", keyGenerator = "keyGenerator")
    public int getSysUserId(){
        System.out.println("-----------------");
        System.out.println(System.currentTimeMillis());
        int id = sysUserMapper.selectByPrimaryKey(1).getUserId();
        System.out.println(System.currentTimeMillis());
        System.out.println("------------------");
        return id;
    }
}
