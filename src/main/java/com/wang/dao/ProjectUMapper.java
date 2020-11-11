package com.wang.dao;

import com.wang.pojo.ProjectU;

 
import java.util.List;

import com.wang.util.Page;
import org.apache.ibatis.annotations.Param;

/***
 * 项目表
 */
public interface ProjectUMapper {

    public  ProjectU selectByPrimaryKey(int pid);

    public List<ProjectU>selectByLimitProject_u(Page page);

    public  int deleteByPrimaryKey(int pid);

    public  int insertSelective(ProjectU projectU);

    public int countByExample();

    public  int updateByPrimaryKeySelective(ProjectU projectU);

}