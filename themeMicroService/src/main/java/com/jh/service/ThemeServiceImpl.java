package com.jh.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.codingapi.tx.annotation.ITxTransaction;
import com.codingapi.tx.annotation.TxTransaction;
import com.jh.dao.ThemeDao;
import com.jh.entity.Theme;

@Service
public class ThemeServiceImpl implements ThemeService, ITxTransaction {
	
	@Autowired
    private ThemeDao themeDao;
	
	@Override
    public List<Theme> getThemeList() {
        return themeDao.getThemeList();
    }
	
	@Transactional
	@TxTransaction(isStart=false)
    @Override
    public int saveTheme(String tName, String tDescription, Integer blockId) {
    	return themeDao.saveTheme(tName, tDescription, blockId);
    }

}
