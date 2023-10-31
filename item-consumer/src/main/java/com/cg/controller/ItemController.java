package com.cg.controller;

import com.cg.dto.ItemPageDto;
import com.cg.entity.Item;
import com.cg.service.ItemService;
import com.cg.vo.ItemVo;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

/**
 * (Item)表控制层
 *
 * @author makejava
 * @since 2023-10-31 09:09:23
 */
@RestController
@RequestMapping("item")
public class ItemController {
    /**
     * 服务对象
     */
    @Reference
    private ItemService itemService;

    @GetMapping("/findTypeByTypeId")
    public List<Item> findTypeByTypeId(Integer typeid){
        return itemService.findItemByTypeId(typeid);
    }

    @PostMapping("/findItemPage")
    Map<String,Object> findItemPage(ItemPageDto itemPageDto){
        return itemService.findItemPage(itemPageDto);
    }


    @GetMapping("/findByTypeId")
    public ItemVo findByTypeId(Integer typeid) {
        return itemService.findByTypeId(typeid);
    }


    @PostMapping("/updateItemByitemId")
    public Integer updateItemByitemId(Item itemVo) {
        return itemService.updateItemByitemId(itemVo);
    }


    @PostMapping("/deleteItem")
    public Integer deleteItem(Integer itemid) {
        return itemService.deleteItem(itemid);
    }

}

