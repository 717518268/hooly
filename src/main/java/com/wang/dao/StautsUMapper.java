package com.wang.dao;

import com.wang.pojo.StautsU;

 
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface StautsUMapper {


     public  StautsU selectByPrimaryKey(int sid);

     public  int deleteByPrimaryKey(int sid);

     public int insertSelective(StautsU stautsU);

     public int countByExample();

     public int updateByPrimaryKeySelective(StautsU stautsU);

}