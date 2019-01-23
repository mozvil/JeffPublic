package com.jh.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.codingapi.tx.annotation.ITxTransaction;
import com.codingapi.tx.annotation.TxTransaction;
import com.jh.client.ThemeClient;
import com.jh.dao.BlockDao;

@Service
public class BlockThemeServiceImpl implements BlockThemeService, ITxTransaction {

	@Autowired
    private BlockDao blockDao;

    @Autowired
    private ThemeClient themeClient; //2主题微服务访问—微服务2的内容 

    @Transactional
    @TxTransaction(isStart=true)
    @Override
    public int saveBlockTheme() {
    	int rs1 = blockDao.saveBlock("jwg1", "111");// 3 保存1
    	int rs2 = themeClient.saveTheme("jwg2", "111", 1);// 4 保存2
    	int rs3 = 100 / 0;
    	return rs1 + rs2 + rs3;
    }

}
