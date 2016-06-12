package com.zf.dao;

import com.zf.domian.SysUser;
import com.zf.mapper.UserMapper;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * SysUserService
 *
 * @author zf
 * @date 16/6/12
 */
@Service
@Transactional
public class SysUserService {

    @Autowired
    UserMapper userMapper;

    public SysUser getUserName(String userName){
        return userMapper.selectUser(userName);
    }


}
