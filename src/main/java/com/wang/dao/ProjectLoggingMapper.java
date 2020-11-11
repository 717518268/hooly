package com.wang.dao;

import com.wang.pojo.ProjectLogging;

 
import java.util.List;

import com.wang.util.Page;
import org.apache.ibatis.annotations.Param;

/**
 * 日志
 */
public interface ProjectLoggingMapper {

    public ProjectLogging selectByPrimaryKey(int pid);

    /***
     * 分页
     * @param page
     * @return
     */
    public List<ProjectLogging>  selectByLimitProject_logging(Page page);

    public int deleteByPrimaryKey(int pid);

    public int insertSelective(ProjectLogging projectLogging);

    public int countByExample();


    public int updateByPrimaryKeySelective(ProjectLogging projectLogging);
}