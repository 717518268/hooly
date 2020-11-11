package com.wang.pojo;

import java.util.Date;

/**
 * 用户表
 */
public class RegisterU {
    /**用户id*/
    private Integer rid;
    /***邮箱号*/
    private String userEmail;
    /**密码*/
    private String password;
    /**注册时间*/
    private Date rtime;
    /**状态*/
    private String stauts;
    /**性别*/
    private String sex;
    /**出生日期*/
    private Date birthday;
    /**团队名字*/
    private String nickname;
    /**外键*/
    private Integer uid;
    /**学校单位*/
    private String mainschool;
    /**人数*/
    private Integer rcount;

    public Integer getRid() {
        return rid;
    }

    public void setRid(Integer rid) {
        this.rid = rid;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail == null ? null : userEmail.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public Date getRtime() {
        return rtime;
    }

    public void setRtime(Date rtime) {
        this.rtime = rtime;
    }

    public String getStauts() {
        return stauts;
    }

    public void setStauts(String stauts) {
        this.stauts = stauts == null ? null : stauts.trim();
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex == null ? null : sex.trim();
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname == null ? null : nickname.trim();
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public String getMainschool() {
        return mainschool;
    }

    public void setMainschool(String mainschool) {
        this.mainschool = mainschool == null ? null : mainschool.trim();
    }

    public Integer getRcount() {
        return rcount;
    }

    public void setRcount(Integer rcount) {
        this.rcount = rcount;
    }
}