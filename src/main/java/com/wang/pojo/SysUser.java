package com.wang.pojo;

import java.util.Date;

/***
 * 管理员表
 */
public class SysUser {
    private Integer id;

    /**账号*/
    private String rootusername;
    /***密码*/
    private String rootpassword;
    /**创建时间*/
    private Date createtime;
    /***权限 从0开始*/
    private Integer rule;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRootusername() {
        return rootusername;
    }

    public void setRootusername(String rootusername) {
        this.rootusername = rootusername == null ? null : rootusername.trim();
    }

    public String getRootpassword() {
        return rootpassword;
    }

    public void setRootpassword(String rootpassword) {
        this.rootpassword = rootpassword == null ? null : rootpassword.trim();
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public Integer getRule() {
        return rule;
    }

    public void setRule(Integer rule) {
        this.rule = rule;
    }
}