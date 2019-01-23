package com.jh.dao;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import com.jh.entity.Theme;

@Mapper
public interface ThemeDao {
	
	@Select(value = "select * from theme")
	@Results({
		@Result(id=true,column="id",property="id"),
		@Result(column="tName",property="tName"),
		@Result(column="tDescription",property="tDescription")
	})
    public List<Theme> getThemeList();
	
	@Insert(value = "insert into theme (tName, tDescription, blockId) values (#{tName}, #{tDescription}, #{blockId})")
    public int saveTheme(
    		@Param("tName") String tName,
    		@Param("tDescription") String tDescription,
    		@Param("blockId") Integer blockId);

}
