package com.microservices.portmoduleservice.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.microservices.commosmodule.schudule.dto.PortDTO;
import com.microservices.portmoduleservice.client.ScheduleModuleServiceClient;

import lombok.RequiredArgsConstructor;

@Service
@Transactional
@RequiredArgsConstructor
public class PortService {

	private final ScheduleModuleServiceClient scheduleModuleServiceClient;

	@Transactional(readOnly = true)
	public PortDTO getPortDetails(final String portName) {
		return scheduleModuleServiceClient.getPortScheduled(portName);
	}

}
