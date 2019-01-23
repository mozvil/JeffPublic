package com.jh.service;

import java.util.List;

import com.jh.entity.Block;

public interface BlockService {
	
	List<Block> getBlockList();

    int saveBlock(String bname, String bDescription);

}
