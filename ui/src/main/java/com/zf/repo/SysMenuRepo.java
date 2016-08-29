package com.zf.repo;

import com.zf.entity.SysMenu;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

/**
 * SysMenu
 *
 * @author zf
 * @date 16/8/28
 */
public interface SysMenuRepo extends JpaRepository<SysMenu, Long>, JpaSpecificationExecutor<SysMenu> {
}
