package com.itbank.mvc04;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MemberController {

	@Autowired
	MemberDAO dao; //di(dependency injection:의존성 주입)
	
	@RequestMapping("insert.do")
	public void insert(MemberDTO memberDTO) throws Exception {
		dao.insert(memberDTO);
	}
	
	
	
	
	
}
