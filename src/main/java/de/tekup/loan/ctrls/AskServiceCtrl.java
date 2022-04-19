package de.tekup.loan.ctrls;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AskServiceCtrl {
	
	@GetMapping("/test/client")
	public String getFormClient() {
		return "ask";
	}

}
