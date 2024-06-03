package com.samiwogDev.fleetLogix;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ApplicationController {

	@GetMapping("/_layout")
	public String _layout() {
		return "_layout";
	}
	
	@GetMapping("/index2")
	public String index2() {
		return "index2";
	}
}
