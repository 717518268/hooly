package com.wang.pojo;

import java.util.Date;

/***
 * 资金表
 */
public class CapitalU {

    /***对应项目cid,不是自增的*/
    private Integer cid;
    /**金额*/
    private Integer count;
    /***创建时间*/
    private Date lasttime;
    /**赞助单位*/
    private String company;

    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public Date getLasttime() {
        return lasttime;
    }

    public void setLasttime(Date lasttime) {
        this.lasttime = lasttime;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company == null ? null : company.trim();
    }
}