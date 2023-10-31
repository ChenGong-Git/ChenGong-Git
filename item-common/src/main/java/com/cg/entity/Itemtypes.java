package com.cg.entity;

import java.io.Serializable;

/**
 * (Itemtypes)实体类
 *
 * @author makejava
 * @since 2023-10-30 15:35:36
 */
public class Itemtypes implements Serializable {
   
    
    private Integer typeid;
    /**
     * 项目名称
     */
    private String typename;


    public Integer getTypeid() {
        return typeid;
    }

    public void setTypeid(Integer typeid) {
        this.typeid = typeid;
    }

    public String getTypename() {
        return typename;
    }

    public void setTypename(String typename) {
        this.typename = typename;
    }

}

