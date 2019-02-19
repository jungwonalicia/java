package com.itbank.mvc04;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Member3Controller {

	@Autowired
	MemberDAO dao;
	
	@RequestMapping("update.do")
	public void update(MemberDTO memberDTO) throws Exception {
		dao.update(memberDTO);
	}
	
	
	
	
}
