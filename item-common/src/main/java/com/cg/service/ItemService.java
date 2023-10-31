package com.cg.service;


import com.cg.dto.ItemPageDto;
import com.cg.entity.Item;
import com.cg.vo.ItemVo;

import java.util.List;
import java.util.Map;

/**
 * (Item)表服务接口
 *
 * @author makejava
 * @since 2023-10-31 08:54:15
 */
public interface ItemService {

    /**
     * 检查结构查询
     * @param typeid
     * @return
     */
    List<Item> findItemByTypeId(Integer typeid);

    /**
     * 检查结果查询并且分页
     * @param itemPageDto
     * @return
     */
    Map<String,Object> findItemPage(ItemPageDto itemPageDto);


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
