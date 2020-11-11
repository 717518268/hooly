package com.wang.dao;

import com.wang.pojo.SysUser;

 
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
 * 管理员表
 */
public interface SysUserMapper {

    /***
     * 管理员登录
     * @param sysUser
     * @return
     */
    public SysUser selectByPrimaryKey(SysUser sysUser);

    public int deleteByPrimaryKey(int id);

    public int insertSelective(SysUser sysUser);

    public int countByExample();

    public  int updateByPrimaryKeySelective(SysUser sysUser);
}