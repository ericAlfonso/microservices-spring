package com.microservices.commosmodule.schudule.dto;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class PortDTO {

	private int id;
	private String name;
	private String location;
	private int numberOfInstancePort;
}
