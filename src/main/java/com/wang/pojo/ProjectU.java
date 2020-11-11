package com.wang.pojo;

import java.util.Date;

/***
 * 项目申请表，发布
 */
public class ProjectU {

    /**自增id**/
    private Integer pid;
    /**项目标题*/
    private String ptitle;
    /**创建时间**/
    private Date pcreatetime;
    /**资金id**/
    private Integer cid;
    /**用户id**/
    private Integer rid;
    /**访问量**/
    private Integer pcount;
    /**状态*/
    private String pstauts;
    /**内容**/
    private String pcontext;

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public String getPtitle() {
        return ptitle;
    }

    public void setPtitle(String ptitle) {
        this.ptitle = ptitle == null ? null : ptitle.trim();
    }

    public Date getPcreatetime() {
        return pcreatetime;
    }

    public void setPcreatetime(Date pcreatetime) {
        this.pcreatetime = pcreatetime;
    }

    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }

    public Integer getRid() {
        return rid;
    }

    public void setRid(Integer rid) {
        this.rid = rid;
    }

    public Integer getPcount() {
        return pcount;
    }

    public void setPcount(Integer pcount) {
        this.pcount = pcount;
    }

    public String getPstauts() {
        return pstauts;
    }

    public void setPstauts(String pstauts) {
        this.pstauts = pstauts == null ? null : pstauts.trim();
    }

    public String getPcontext() {
        return pcontext;
    }

    public void setPcontext(String pcontext) {
        this.pcontext = pcontext == null ? null : pcontext.trim();
    }
}