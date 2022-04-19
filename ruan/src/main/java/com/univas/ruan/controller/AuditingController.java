package com.univas.ruan.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.univas.ruan.model.Auditing;
import com.univas.ruan.service.AudService;

@RestController
@RequestMapping
public class AuditingController {
	
	
	@Autowired
	private AudService service;
	
	@GetMapping()
	public List<Auditing> getAllAuds(){
		return service.getAllAuds();
		
	}
	
	public Auditing getAuditing(@PathVariable Long code) {
		Auditing aud = service.getAudById(code);
		return aud;
	}

}
