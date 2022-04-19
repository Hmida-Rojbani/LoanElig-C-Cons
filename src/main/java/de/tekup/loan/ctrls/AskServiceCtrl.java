package de.tekup.loan.ctrls;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import de.tekup.loan.service.CallService;
import de.tekup.loan.soap.api.consume.loaneligibilty.CustomerRequest;
import de.tekup.loan.soap.api.consume.loaneligibilty.ObjectFactory;
import de.tekup.loan.soap.api.consume.loaneligibilty.WsResponse;

@Controller
public class AskServiceCtrl {
	
	@Autowired
	private CallService service;
	
	@GetMapping("/test/client")
	public String getFormClient(Model model) {
		model.addAttribute("request", new ObjectFactory().createCustomerRequest());
		return "ask";
	}
	
	@PostMapping("/test/client")
	public String postFormClient(Model model,@ModelAttribute("request") CustomerRequest request) {
		WsResponse response = service.callSoapService(request);
		
		// TODO display over HTML the Response
		model.addAttribute("response", response);
		return "response";
	}

}
