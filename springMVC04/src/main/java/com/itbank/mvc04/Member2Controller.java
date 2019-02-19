package com.itbank.mvc04;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Member2Controller {

	@Autowired
	MemberDAO dao;
	
	@RequestMapping("delete.do")
	public void delete(MemberDTO memberDTO) throws Exception {
		dao.delete(memberDTO);
	}
	
	
	
	
	
	
	
	
	
}
