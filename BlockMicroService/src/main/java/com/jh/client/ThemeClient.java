package com.jh.client;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.jh.entity.Theme;

//fallback 容错处理类
@FeignClient(name="themeMicroService", fallback=Demo2ClientHystric.class)
public interface ThemeClient {
	
	@RequestMapping(value="/getThemeList", method=RequestMethod.GET)
    public List<Theme> getThemeList();

    @RequestMapping(value="/saveTheme", method=RequestMethod.GET)
    public int saveTheme(
         @RequestParam("tName") String tName,
         @RequestParam("tDescription") String tDescription,
         @RequestParam("blockId") Integer blockId);

}
