package com.cg.entity;

import java.io.Serializable;

/**
 * (Item)实体类
 *
 * @author makejava
 * @since 2023-10-31 08:54:15
 */
public class Item implements Serializable {
   
    /**
     * 项目id
     */
    private Integer itemid;
    /**
     * 项目名称
     */
    private String itemname;
    /**
     * 项目类型id
     */
    private Integer typeid;
    /**
     * 是否必检 1 是 0 否
     */
    private Integer necessary;
    /**
     * 参考值
     */
    private String ref;
    /**
     * 价格
     */
    private Double price;
    /**
     * 说明
     */
    private String info;


    public Integer getItemid() {
        return itemid;
    }

    public void setItemid(Integer itemid) {
        this.itemid = itemid;
    }

    public String getItemname() {
        return itemname;
    }

    public void setItemname(String itemname) {
        this.itemname = itemname;
    }

    public Integer getTypeid() {
        return typeid;
    }

    public void setTypeid(Integer typeid) {
        this.typeid = typeid;
    }

    public Integer getNecessary() {
        return necessary;
    }

    public void setNecessary(Integer necessary) {
        this.necessary = necessary;
    }

    public String getRef() {
        return ref;
    }

    public void setRef(String ref) {
        this.ref = ref;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

}

