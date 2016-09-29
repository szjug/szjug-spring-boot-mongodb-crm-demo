package com.example.democrm.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Controller for sending the user to the login view.
 *
 */
@Controller
public class HomeController {
	@RequestMapping("/")
	public String index() {
		return "index";
	}
}
