package com.microservices.schedulemoduleservice.hibernate.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.microservices.schedulemoduleservice.entity.Port;

public interface PortHibernateDAO extends JpaRepository<Port, Integer>{

	Port findByName(String name);
}
