package org.chen.flow.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("home")
public class baseController {

	@RequestMapping("{page}")
	public String getPage(@PathVariable String page) {
		return page;
	}
}
