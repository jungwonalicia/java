package com.itbank.mvc02;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BbsController {

	@RequestMapping("insert2.do")
	public String insert2(BbsDTO bbsDTO) {
		
		return "bbsView";
	}
	
	
	
	
	
}
