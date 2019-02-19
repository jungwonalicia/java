package com.itbank.mvc04;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BbsController {

	@Autowired
	BbsDAO dao;
	
	@RequestMapping("insert2.do")
	public void insert2(BbsDTO bbsDTO) throws Exception {
		dao.insert(bbsDTO);
	}
	
	
	
	
	
	
	
	
	
}
