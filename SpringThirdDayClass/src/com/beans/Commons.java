package com.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Commons {
	
	@Value("${com.org.name}")
	private String name;
	@Value("${com.org.batch}")
	private String orgBatch;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getOrgBatch() {
		return orgBatch;
	}
	public void setOrgBatch(String orgBatch) {
		this.orgBatch = orgBatch;
	}
	@Override
	public String toString() {
		return "Commons [name=" + name + ", orgBatch=" + orgBatch + "]";
	}
	
	
	
}
