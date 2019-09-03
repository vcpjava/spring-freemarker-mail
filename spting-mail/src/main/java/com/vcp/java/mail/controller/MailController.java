package com.vcp.java.mail.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.vcp.java.mail.dto.MailRequest;
import com.vcp.java.mail.dto.MailResponse;
import com.vcp.java.mail.service.MailService;

@RestController
public class MailController {
  
	@Autowired
	private MailService service;
	
	@PostMapping("/sendingEmail")
	public MailResponse sendMail(@RequestBody MailRequest request) {
		Map<String,Object> model = new HashMap();
		model.put("name", request.getName());
		model.put("location", "Blore,India");
		return  service.sendEmail(request, model);
	}
}
