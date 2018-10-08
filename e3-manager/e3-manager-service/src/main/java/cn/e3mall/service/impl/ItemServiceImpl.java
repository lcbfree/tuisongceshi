package cn.e3mall.service.impl;

import cn.e3mall.service.ItemService;
import cn.e3mall.mapper.TbItemMapper;
import com.e3shop.pojo.TbItem;
import org.springframework.beans.factory.annotation.Autowired;

public class ItemServiceImpl implements ItemService {

    @Autowired
    private TbItemMapper itemMapper;

    @Override
    public TbItem findItem(Long id) {

        TbItem tbItem = itemMapper.selectByPrimaryKey(id);

        return tbItem;
    }
}
