package com.zf.mapper;

import com.zf.domian.SysUser;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

/**
 * Created by zengfeng on 16/6/12.
 */
@Mapper
public interface UserMapper {

    SysUser selectUser(String username);

    @Select("SELECT * FROM sys_user where id = #{id}")
    SysUser selectUserName(@Param("state") String state);
}
