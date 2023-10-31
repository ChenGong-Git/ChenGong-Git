package com.cg.dao;


import com.cg.entity.Itemtypes;

import java.util.List;

/**
 * (Itemtypes)表数据库访问层
 *
 * @author makejava
 * @since 2023-10-30 14:51:23
 */
public interface ItemtypesMapper {

  //加载所有的检查类型
    List<Itemtypes> queryItemType();

}

