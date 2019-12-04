package com.microservices.schedulemoduleservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.microservices.schedulemoduleservice.beans.Port;
import com.microservices.schedulemoduleservice.repository.PortRepository;

@RestController
public class ScheduleController {
	
	@Autowired
	private Environment environment;
	
	@Autowired
	private PortRepository portRepository;

	@GetMapping("/schedule/port/{name}")
	public Port getSchedulePort(@PathVariable("name") final String name){
		
		Port port = portRepository.findByName(name); 
		port.setNumberOfIntancePort(Integer.parseInt(environment.getProperty("local.server.port")));
		return port;
	}
}
