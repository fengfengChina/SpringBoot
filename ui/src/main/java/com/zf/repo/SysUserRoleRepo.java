package com.zf.repo;

import com.zf.entity.SysUserRole;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

/**
 * UserRepo
 *
 * @author zf
 * @date 16/7/4
 */
public interface SysUserRoleRepo extends JpaRepository<SysUserRole, Long>, JpaSpecificationExecutor<SysUserRole> {

}

