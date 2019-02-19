package com.itbank.mvc02;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller //표시(어노테이션)
public class MemberController {
	
	@RequestMapping("check.do")
	public String check(@RequestParam("id") String id,
					  @RequestParam("pw") String pw) {
		System.out.println("내가 호출되었어요.");
		String sId ="root";
		String sPw ="1234";
		if(id.equals(sId) && pw.equals(sPw)){
			return "ok";
		}else{
			return "redirect:login.jsp";
		}
	}
	
	@RequestMapping("insert.do")
	public void insert(MemberDTO memberDTO) {
		System.out.println(memberDTO.getId());
		System.out.println(memberDTO.getPw());
		System.out.println(memberDTO.getName());
		System.out.println(memberDTO.getTel());
	}

	
	
	
	
	
	
	
}
