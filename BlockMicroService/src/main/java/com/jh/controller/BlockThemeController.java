package com.jh.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jh.client.ThemeClient;
import com.jh.entity.Theme;
import com.jh.service.BlockThemeService;

@RestController
public class BlockThemeController {
	
	@Autowired
    private BlockThemeService blockThemeService;
	
	@Autowired
    private ThemeClient themeClient;
	
	@RequestMapping("/getThemeList")
    public List<Theme> getThemeList() {
		return themeClient.getThemeList();
	}
	
    @RequestMapping("/saveBlockTheme")
    public String saveBlockTheme() {
    	//调用整合服务
    	/*
    	Block block = new Block();
    	block.setBname("jwg10");
    	block.setbDescription("jwg10 block");
    	Theme theme = new Theme();
    	theme.settName("jwg11");
    	theme.settDescription("jwg11 theme");
    	*/
        Integer rs = blockThemeService.saveBlockTheme();
        return rs.toString();
    }

}
