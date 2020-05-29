package com.shivi.beans.engine;

import org.springframework.stereotype.Component;

@Component
public class Engine {
	private String model;

	public void setModel(String model) {
		this.model = model;
	}

	public String getModel() {
		return model;
	}
}
