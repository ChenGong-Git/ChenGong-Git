package com.cg.service;


import com.cg.entity.Itemtypes;

import java.util.List;

/**
 * (Itemtypes)表服务接口
 *
 * @author makejava
 * @since 2023-10-30 15:35:37
 */
public interface ItemtypesService {

    //加载所有的检查类型
    List<Itemtypes> queryItemType();

}
