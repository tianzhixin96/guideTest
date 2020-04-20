package com.pinyougou.entity;

import java.io.Serializable;
import java.util.List;

public class PageResult implements Serializable {

    long total;

    List rows;

    @Override
    public String toString() {
        return "PageResult{" +
                "total=" + total +
                ", rows=" + rows +
                '}';
    }

    public long getTotal() {
        return total;
    }

    public void setTotal(long total) {
        this.total = total;
    }

    public List getRows() {
        return rows;
    }

    public void setRows(List rows) {
        this.rows = rows;
    }

    public PageResult() {
    }

    public PageResult(long total, List rows) {
        this.total = total;
        this.rows = rows;
    }
}
