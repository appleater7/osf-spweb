package com.osf.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.osf.web.service.CustomerInfoService;

@Controller
public class CustomerInfoController {

	@Autowired
	private CustomerInfoService cis;
	
	@RequestMapping(value="/ci/list", method=RequestMethod.GET)
	public String goSelectList(Model m) {
		m.addAttribute("ciList", cis.selectCustomerInfoList());
		return "/ci/list";
	}
}
