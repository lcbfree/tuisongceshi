package cn.e3mall.controller;

import cn.e3mall.service.ItemService;
import com.e3shop.pojo.TbItem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

public class ItemController {

    @Autowired
    private ItemService itemService;

    @RequestMapping(value = "/item/find",method = RequestMethod.GET)
    @ResponseBody
    public TbItem findItemById(Long id){

        TbItem item = itemService.findItem(id);

        return item;
    }
}
