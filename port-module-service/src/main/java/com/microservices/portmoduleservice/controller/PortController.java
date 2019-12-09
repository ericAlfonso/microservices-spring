package com.microservices.portmoduleservice.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.microservices.commosmodule.schudule.dto.PortDTO;
import com.microservices.portmoduleservice.service.PortService;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
@RequestMapping("/port")
public class PortController {

	private final PortService portService;

	@GetMapping("/{portName}/details")
	public ResponseEntity<PortDTO> getPortScheduledDetails(@PathVariable("portName") final String portName) {
		return ResponseEntity.ok(portService.getPortDetails(portName));
	}
}
