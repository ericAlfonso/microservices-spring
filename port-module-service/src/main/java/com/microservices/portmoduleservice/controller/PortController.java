package com.microservices.portmoduleservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.microservices.portmoduleservice.beans.PortDetails;
import com.microservices.portmoduleservice.client.ScheduleModuleServiceClient;

@RestController
public class PortController {
	
	@Autowired
	private ScheduleModuleServiceClient scheduleModuleServiceClient;

	@GetMapping("port/{portName}/details")
	public PortDetails getPortScheduledDetails(
			 @PathVariable("portName") final String portName) {
		PortDetails portDetails = scheduleModuleServiceClient.getPortScheduled(portName);
		portDetails.setNumberOfShips(30);
		return portDetails;
	}
}
