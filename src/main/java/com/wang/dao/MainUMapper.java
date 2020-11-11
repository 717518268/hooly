package com.wang.dao;

import com.wang.pojo.MainU;
 
import java.util.List;

import com.wang.util.Page;
import org.apache.ibatis.annotations.Param;
/**
 * 发布内容表
 */
public interface MainUMapper {
    /***
     * 根据id查
     * @param mid
     * @return
     */
    public  MainU selectByPrimaryKey(int mid);

    /**
     * 分页
     * @param page
     * @return
     */
    public List<MainU>selectByLimit(Page page);


    public int deleteByPrimaryKey(int mid);

    public int insertSelective(MainU mainU);

    public int countByExample();

    public int updateByPrimaryKeySelective(MainU mainU);

}