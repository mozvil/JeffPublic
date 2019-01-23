package com.jh.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.jh.entity.Block;
import com.jh.service.BlockService;

@RestController
public class BlockController {
	
	@Autowired
    private BlockService blockService;

    // 1接受请求
    @RequestMapping(value = "/getBlockList", method = RequestMethod.GET)
    public List<Block> getBlockList() {
    	return blockService.getBlockList();
    }

    //2调用其他服务
    @RequestMapping(value = "/saveBlock", method = RequestMethod.GET)
    public String saveBlock() {
        blockService.saveBlock("cc", "cc");
    	return "保存成功";
    }

}
