package com.zf.dao;

import com.zf.domain.SysUserRoles;
import com.zf.domain.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

/**
 * UserMapper
 *
 * @author zf
 * @date 16/6/14
 */
@Mapper
public interface UserMapper {

    @Select("select * from user where username = #{username}")
    User selectByUserName(String username);

    

}
