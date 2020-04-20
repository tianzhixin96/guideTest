package com.pinyougou.pojo;

import java.io.Serializable;

public class TbSt implements Serializable {
    private Long id;

    private Long cid;

    private String name;

    private String describe;

    private String path;

    private TbClazz clazz;

    public TbClazz getClazz() {
        return clazz;
    }

    public void setClazz(TbClazz clazz) {
        this.clazz = clazz;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getCid() {
        return cid;
    }

    public void setCid(Long cid) {
        this.cid = cid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescribe() {
        return describe;
    }

    public void setDescribe(String describe) {
        this.describe = describe;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }
}