package com.jh.dao;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Select;

import com.jh.entity.Block;

@Mapper
public interface BlockDao {
	
	@Select(value="select * from block")
	@Results({
		@Result(id=true,column="id",property="id"),
		@Result(column="bname",property="bname"),
		@Result(column="bDescription",property="bDescription")
	})
	public List<Block> getBlockList();
	
	@Insert(value="insert into block(bname, bDescription) values (#{bname}, #{bDescription})")
	public int saveBlock(@Param("bname") String bname, @Param("bDescription") String bDescription);

}
