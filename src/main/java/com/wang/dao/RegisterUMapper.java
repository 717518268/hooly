package com.wang.dao;

import com.wang.pojo.RegisterU;

 
import java.util.List;

import com.wang.util.Page;
import org.apache.ibatis.annotations.Param;

/**
 * 注册表，用户表，
 */
public interface RegisterUMapper {

    /***
     * 登录
     * @param registerU
     * @return
     */
    public  RegisterU selectByForLogin(RegisterU registerU);

    public RegisterU selectByPrimaryKeyRid(int rid);

    public List<RegisterU>selectByLimitRegister(Page page);

    public int deleteByPrimaryKey(int rid);

    public int insertSelective(RegisterU registerU);

    public int countByExample();

    public int updateByPrimaryKeySelective(RegisterU registerU);

}