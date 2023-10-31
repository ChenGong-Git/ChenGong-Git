package com.cg.dto;

import java.io.Serializable;

public class ItemPageDto extends PageDto implements Serializable {
    private Integer typeid;

    public Integer getTypeid() {
        return typeid;
    }

    public void setTypeid(Integer typeid) {
        this.typeid = typeid;
    }
}
