package com.wang.dao;

import com.wang.pojo.CapitalU;

 
import java.util.List;
import org.apache.ibatis.annotations.Param;
/***
 * 资金表
 */
public interface CapitalUMapper {

    /***
     * 根据id查询资金对应项目
     * @param cid
     * @return
     */
    public CapitalU selectByPrimaryKey(int cid);

    /***
     * 删除一栏资金
     * @param cid
     * @return
     */
    public int deleteByPrimaryKey(int cid);

    /****
     * 添加
     * @param capitalU
     * @return
     */
    public int insertSelective(CapitalU capitalU);

    /**
     * 查总数
     * */
    public int countByExample();

    /***
     * 修改
     * @param capitalU
     * @return
     */
    public int updateByPrimaryKeySelective(CapitalU capitalU);
}