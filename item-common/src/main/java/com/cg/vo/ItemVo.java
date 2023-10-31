package com.cg.vo;

import com.cg.entity.Item;

import java.io.Serializable;

public class ItemVo extends Item implements Serializable {
    private String itemTypeName;

    public String getItemTypeName() {
        return itemTypeName;
    }

    public void setItemTypeName(String itemTypeName) {
        this.itemTypeName = itemTypeName;
    }
}
