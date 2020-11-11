package com.wang.pojo;

import java.util.Date;

/***
 * 项目审核表，日志
 */
public class ProjectLogging {
    /***
     * 对应项目pid
     */
    private Integer pid;
    /**项目名称**/
    private String lcontext;
    /**状态**/
    private String lstauts;
    /**创建时间**/
    private Date createtime;
    /***管理员名字*/
    private String username;

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public String getLcontext() {
        return lcontext;
    }

    public void setLcontext(String lcontext) {
        this.lcontext = lcontext == null ? null : lcontext.trim();
    }

    public String getLstauts() {
        return lstauts;
    }

    public void setLstauts(String lstauts) {
        this.lstauts = lstauts == null ? null : lstauts.trim();
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }



}