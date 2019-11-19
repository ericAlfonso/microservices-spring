package com.microservices.schedulemoduleservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.microservices.schedulemoduleservice.beans.Port;

public interface PortRepository extends JpaRepository<Port, Integer>{

	Port findByName(String name);
}
