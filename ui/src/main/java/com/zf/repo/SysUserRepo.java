package com.zf.repo;

import com.zf.entity.SysRole;
import com.zf.entity.SysUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

/**
 * UserRepo
 *
 * @author zf
 * @date 16/7/4
 */
public interface SysUserRepo extends JpaRepository<SysUser, Long>, JpaSpecificationExecutor<SysUser> {

}

