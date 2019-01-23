package com.jh.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.codingapi.tx.annotation.TxTransaction;
import com.jh.dao.BlockDao;
import com.jh.entity.Block;

@Service
public class BlockServiceImpl implements BlockService {
	
	@Autowired
	private BlockDao blockDao;

	@Override
	public List<Block> getBlockList() {
		return blockDao.getBlockList();
	}

	@TxTransaction
	@Transactional
	@Override
	public int saveBlock(String bname, String bDescription) {
		return blockDao.saveBlock("jwg1", "111");
	}

}
