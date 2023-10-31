package com.cg.service.impl;

import com.cg.dao.ItemMapper;
import com.cg.dto.ItemPageDto;
import com.cg.entity.Item;
import com.cg.service.ItemService;
import com.cg.vo.ItemVo;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.apache.dubbo.config.annotation.Service;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * (Item)表服务实现类
 *
 * @author makejava
 * @since 2023-10-31 08:56:22
 */
@Service
public class ItemServiceImpl implements ItemService {
    @Resource
    private ItemMapper itemMapper;


    @Override
    public List<Item> findItemByTypeId(Integer typeId) {
        return itemMapper.findItemByTypeId(typeId);
    }

    @Override
    public Map<String, Object> findItemPage(ItemPageDto itemPageDto) {
        PageHelper.startPage(itemPageDto.getPageNo(),itemPageDto.getPageSize());
        List<Item> itemByTypeId = itemMapper.findItemByTypeId(itemPageDto.getTypeid());
        PageInfo pageInfo = new PageInfo(itemByTypeId);
        Map<String,Object> map = new HashMap<>();
        map.put("pageInfo",pageInfo);
        return map;
    }

    @Override
    public ItemVo findByTypeId(Integer typeid) {
        return itemMapper.findByTypeId(typeid);
    }

    @Override
    public Integer updateItemByitemId(Item itemVo) {
        return itemMapper.updateItemByitemId(itemVo);
    }

    @Override
    public Integer deleteItem(Integer itemid) {
        return itemMapper.deleteItem(itemid);
    }


}
