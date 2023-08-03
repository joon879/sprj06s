package com.tech.sprj06s.jeon;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JeonController {
	
	@RequestMapping("/jeon/jeon1")
	public String jeon1() {
		System.out.println("==== jeon1 ====");
		
		return "/jeon/jeon1";
	}

}
