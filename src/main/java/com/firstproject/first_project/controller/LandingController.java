package com.firstproject.first_project.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


import com.firstproject.first_project.dto.LandingDTO;



@Controller
public class LandingController {

	private static final Logger LOGGER = LoggerFactory.getLogger(LandingController.class);

	public LandingController() {
		LOGGER.info(this.getClass().getSimpleName() + " Created...");
	}

	@RequestMapping("home")
	public String onLanding() {
		LOGGER.info("Hello welcome to Home Page... ");
		return  "home.jsp";
	}

	@RequestMapping("clickEvent")
	public String onLandSuccess(LandingDTO landingDTO, Model model) {
		LOGGER.info("Inside onLandSuccess()... ");
		LOGGER.info("Name is: " + landingDTO.getName() + "\t Message is: " + landingDTO.getMessage());
		model.addAttribute("nameOfSender", landingDTO.getName());
		model.addAttribute("yourMessage", landingDTO.getMessage());
		return  "succes.jsp";
	}
}
