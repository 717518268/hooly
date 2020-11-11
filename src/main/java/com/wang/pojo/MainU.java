package com.wang.pojo;

import java.util.Date;

/**
 * 发布内容表
 */
public class MainU {

    /***
     * 自增的
     */
    private Integer mid;
    /**图片*/
    private String mimage;
    /**标题*/
    private String mtitle;
    /**创建时间**/
    private Date mcreatetime;
    /**内容信息*/
    private String mcontext;

    public Integer getMid() {
        return mid;
    }

    public void setMid(Integer mid) {
        this.mid = mid;
    }

    public String getMimage() {
        return mimage;
    }

    public void setMimage(String mimage) {
        this.mimage = mimage == null ? null : mimage.trim();
    }

    public String getMtitle() {
        return mtitle;
    }

    public void setMtitle(String mtitle) {
        this.mtitle = mtitle == null ? null : mtitle.trim();
    }

    public Date getMcreatetime() {
        return mcreatetime;
    }

    public void setMcreatetime(Date mcreatetime) {
        this.mcreatetime = mcreatetime;
    }

    public String getMcontext() {
        return mcontext;
    }

    public void setMcontext(String mcontext) {
        this.mcontext = mcontext == null ? null : mcontext.trim();
    }
}