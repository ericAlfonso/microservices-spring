package com.microservices.schedulemoduleservice.service;

import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.microservices.commosmodule.schudule.dto.PortDTO;
import com.microservices.schedulemoduleservice.entity.Port;
import com.microservices.schedulemoduleservice.hibernate.dao.PortHibernateDAO;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
@Transactional
public class ScheduleService {

	private PortHibernateDAO portRepository;
	private Environment environment;

	@Transactional(readOnly = true)
	public PortDTO getPort(final String portName) {
		return populatePortToDTO(portRepository.findByName(portName));
	}

	private PortDTO populatePortToDTO(final Port port) {
		return PortDTO.builder().id(port.getId()).location(port.getLocation()).name(port.getName())
				.numberOfInstancePort(Integer.parseInt(environment.getProperty("local.server.port"))).build();
	}
}
