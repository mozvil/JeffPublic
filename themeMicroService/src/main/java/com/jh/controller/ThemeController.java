package com.jh.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.jh.entity.Theme;
import com.jh.service.ThemeService;

@RestController
public class ThemeController {
	
	@Autowired
    private ThemeService themeService;

    @RequestMapping(value="/getThemeList", method=RequestMethod.GET)
    public List<Theme> getThemeList() {
    	return themeService.getThemeList();
    }

    @RequestMapping(value="/saveTheme", method=RequestMethod.GET)
    public int saveTheme() {
    	return themeService.saveTheme("jwg2", "jwg2", 1);
    }

}
