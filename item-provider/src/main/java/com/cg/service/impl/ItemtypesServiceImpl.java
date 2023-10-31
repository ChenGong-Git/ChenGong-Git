package com.cg.service.impl;

import com.cg.dao.ItemtypesMapper;
import com.cg.entity.Itemtypes;
import com.cg.service.ItemtypesService;
import org.apache.dubbo.config.annotation.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (Itemtypes)表服务实现类
 *
 * @author makejava
 * @since 2023-10-30 14:51:22
 */
@Service
public class ItemtypesServiceImpl implements ItemtypesService {

    @Resource
    private ItemtypesMapper itemtypesMapper;


    @Override
    public List<Itemtypes> queryItemType() {
        return itemtypesMapper.queryItemType();
    }
}
