package com.cg.controller;

import com.cg.entity.Itemtypes;
import com.cg.service.ItemtypesService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * (Itemtypes)表控制层
 *
 * @author makejava
 * @since 2023-10-30 15:35:31
 */
@RestController
@RequestMapping("itemtypes")
public class ItemtypesController {
    /**
     * 服务对象
     */
    @Reference
    private ItemtypesService itemtypesService;


    //加载所有检查类型
    @GetMapping("/queryAllItemType")
    List<Itemtypes> queryAllType(){
        return itemtypesService.queryItemType();
    }

}

