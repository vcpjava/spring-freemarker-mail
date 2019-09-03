package com.vcp.java.mail.dto;

import org.springframework.stereotype.Component;

@Component
public class MailRequest {
	private String name;
	private String to;
	private String from;
	private String sublect;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTo() {
		return to;
	}

	public void setTo(String to) {
		this.to = to;
	}

	public String getFrom() {
		return from;
	}

	public void setFrom(String from) {
		this.from = from;
	}

	public String getSublect() {
		return sublect;
	}

	public void setSublect(String sublect) {
		this.sublect = sublect;
	}

	public MailRequest(String name, String to, String from, String sublect) {
		this.name = name;
		this.to = to;
		this.from = from;
		this.sublect = sublect;
	}

	public MailRequest() {
		// TODO Auto-generated constructor stub
	}
	
	
	
	

}
