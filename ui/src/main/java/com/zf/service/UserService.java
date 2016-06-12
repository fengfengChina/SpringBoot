package com.zf.service;

import com.zf.domian.SysUser;
import com.zf.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * UserService
 *
 * @author zf
 * @date 16/6/12
 */
@Service
public class UserService {
    @Autowired
    private UserMapper userMapper;

    public SysUser readUserByUsername(String username){
        return userMapper.selectUser(username);
    }
}
