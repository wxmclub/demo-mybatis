package com.wxmclub.demo.mybatis.pagehelper.dao.mapper.model;

import java.io.Serializable;

/**
 * @author AB053324 WangXiaoMing
 * @version 1.0
 * @date 2017-10-09
 */
public class Doc implements Serializable {

    private static final long serialVersionUID = -596035037939606426L;

    private String id;
    private String name;
    private Integer sortNo;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getSortNo() {
        return sortNo;
    }

    public void setSortNo(Integer sortNo) {
        this.sortNo = sortNo;
    }
}
