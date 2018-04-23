package com.spring.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/web/*")
public class WebController {
	private static final Logger logger = LoggerFactory.getLogger(WebController.class);
	
	
	@RequestMapping(path="/index", method=RequestMethod.GET)
	public String indexGet() throws Exception{
		//게시글 등록 폼 띄우기
		logger.info("index get.............");
		return "/web/index";
	}
}
