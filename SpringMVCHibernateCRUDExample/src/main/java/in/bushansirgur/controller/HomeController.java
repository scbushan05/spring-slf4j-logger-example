package in.bushansirgur.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	@RequestMapping("/")
	public String homePage() {
		logger.info("This is logger info::::::");
		logger.debug("This is logger debug:::::");
		logger.error("This is logger error");
		return "home";
	}
}
