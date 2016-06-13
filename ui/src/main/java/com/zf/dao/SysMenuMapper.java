package src/main/java/com/zf/dao;

import src/main/java/com/zf/domain.SysMenu;

public interface SysMenuMapper {
    int deleteByPrimaryKey(Integer menuId);

    int insert(SysMenu record);

    int insertSelective(SysMenu record);

    SysMenu selectByPrimaryKey(Integer menuId);

    int updateByPrimaryKeySelective(SysMenu record);

    int updateByPrimaryKey(SysMenu record);
}