package com.cg.dao;


import com.cg.entity.Item;
import com.cg.vo.ItemVo;

import java.util.List;

/**
 * (Item)表数据库访问层
 *
 * @author makejava
 * @since 2023-10-31 08:56:22
 */
public interface ItemMapper {

    List<Item> findItemByTypeId(Integer typeId);


    /**
     * 根据id查询对象
     * @param typeid
     * @return
     */
    ItemVo findByTypeId(Integer typeid);


    /**
     * 根据id修改信息
     * @param itemVo
     * @return
     */
    Integer updateItemByitemId(Item itemVo);


    /**
     * 根据itemid删除item信息
     * @param itemid
     * @return
     */
    Integer deleteItem(Integer itemid);

}

