package com.jh.service;

import java.util.List;

import com.jh.entity.Theme;

public interface ThemeService {
	
	List<Theme> getThemeList();
	
	int saveTheme(String tName, String tDescription, Integer blockId);

}
