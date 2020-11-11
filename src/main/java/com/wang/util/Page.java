package com.wang.util;

import java.io.Serializable;
import java.util.List;

/**
 * 分页工具类
 */
public class Page<T> implements Serializable {

    private  int startIndex;
    private int pageSize;

    private int total;
    private List<T>arrayalllist;



    public List<T> getArrayalllist() {
        return arrayalllist;
    }

    public void setArrayalllist(List<T> arrayalllist) {
        this.arrayalllist = arrayalllist;
    }

    public int getStartIndex() {
        return startIndex;
    }

    public int getPageSize() {
        return pageSize;
    }

    public int getTotal() {
        return total;
    }

    public void setStartIndex(int startIndex) {
        this.startIndex = startIndex;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public void setTotal(int total) {
        this.total = total;
    }



    @Override
    public String toString() {
        return "Page{" +
                "startIndex=" + startIndex +
                ", pageSize=" + pageSize +
                ", total=" + total +
                ", arrayalllist=" + arrayalllist +
                '}';
    }

    public Page(int startIndex, int pageSize) {
        this.startIndex = startIndex;
        this.pageSize = pageSize;

    }

    public Page() {
    }
}
