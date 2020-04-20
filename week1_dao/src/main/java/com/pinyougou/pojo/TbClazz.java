package com.pinyougou.pojo;

import java.io.Serializable;
import java.util.List;

public class TbClazz implements Serializable {
    private Long id;

    private String name;

    private String leval;

    public List<TbSt> getTbStList() {
        return tbStList;
    }

    public void setTbStList(List<TbSt> tbStList) {
        this.tbStList = tbStList;
    }

    private List<TbSt> tbStList;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLeval() {
        return leval;
    }

    public void setLeval(String leval) {
        this.leval = leval;
    }
}