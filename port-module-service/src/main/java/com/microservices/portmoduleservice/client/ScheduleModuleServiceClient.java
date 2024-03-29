package com.microservices.portmoduleservice.client;

import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.microservices.portmoduleservice.beans.PortDetails;

//@FeignClient(name = "schedule-module-service")
@FeignClient(name = "zuul-api-gateway-server")
@RibbonClient(name = "schedule-module-service")
public interface ScheduleModuleServiceClient {

	@GetMapping("/schedule-module-service/schedule/port/{name}")
	public PortDetails getPortScheduled(
				@PathVariable("name") final String name);
}
