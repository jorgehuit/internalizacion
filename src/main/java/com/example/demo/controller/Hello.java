package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.Message;

@RestController
public class Hello {
	
	@Autowired
	private MessageSource messageSource;
	
	@GetMapping(value = "/api")
	public Message getMessage() {
		
		String msgInter = messageSource.getMessage("good.morning.message", null, LocaleContextHolder.getLocale());
		return new Message(msgInter);
	}  

}
