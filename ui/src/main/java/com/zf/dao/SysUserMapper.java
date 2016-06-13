package src/main/java/com/zf/dao;

import src/main/java/com/zf/domain.SysUser;

public interface SysUserMapper {
    int deleteByPrimaryKey(Integer usedId);

    int insert(SysUser record);

    int insertSelective(SysUser record);

    SysUser selectByPrimaryKey(Integer usedId);

    int updateByPrimaryKeySelective(SysUser record);

    int updateByPrimaryKey(SysUser record);
}