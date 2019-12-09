package com.microservices.schedulemoduleservice.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.microservices.commosmodule.schudule.dto.PortDTO;
import com.microservices.schedulemoduleservice.service.ScheduleService;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
@RequestMapping("/schedule")
public class ScheduleController {

	private final ScheduleService scheduleService;

	@GetMapping("/port/{name}")
	public ResponseEntity<PortDTO> getPortByName(@PathVariable("name") final String name) {

		return ResponseEntity.ok(scheduleService.getPort(name));
	}
}
