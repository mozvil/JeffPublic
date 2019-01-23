package com.jh.client;

import java.util.List;

import org.springframework.stereotype.Component;

import com.jh.entity.Theme;

@Component
public class Demo2ClientHystric implements ThemeClient {
	
	@Override
    public List<Theme> getThemeList() {
        System.out.println("进入断路器");
        throw new RuntimeException(" 失败.");
    }
	
    //丢出异常
    @Override
    public int saveTheme(String tName, String tDescription, Integer blockId) {
        System.out.println("进入断路器");
        throw new RuntimeException("失败!");
    }
    
}
