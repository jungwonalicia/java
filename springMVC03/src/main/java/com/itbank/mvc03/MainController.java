package com.itbank.mvc03;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {

	@RequestMapping("confirm")
	public void call(@RequestParam("today") String today, Model model) {
		model.addAttribute("today",today);
	}
}
