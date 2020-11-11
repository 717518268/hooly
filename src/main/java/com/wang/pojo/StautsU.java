package com.wang.pojo;

import java.util.Date;

/***
 * 状态表
 */
public class StautsU {
    private Integer sid;
    /**状态*/
    private String value;
    /***
     *
     */
    private Date createtime;

    public Integer getSid() {
        return sid;
    }

    public void setSid(Integer sid) {
        this.sid = sid;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value == null ? null : value.trim();
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }
}