package com.samiwogDev.fleetLogix;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ApplicationController {
	
	@GetMapping("/index")
	public String dashboard() {
		return "index";
	}


	@GetMapping("/accounts")
	public String accounts() {
		return "accounts/index";
	}
	
	@GetMapping("/fleet")
	public String fleet() {
		return "fleet/index";
	}
	
	@GetMapping("/helpdesk")
	public String helpdesk() {
		return "helpdesk/index";
	}
	
	@GetMapping("/hr")
	public String hr() {
		return "hr/index";
	}
	
	@GetMapping("/payroll")
	public String payroll() {
		return "payroll/index";
	}
	
	@GetMapping("/parameters")
	public String parameters() {
		return "parameters/index";
	}
}
