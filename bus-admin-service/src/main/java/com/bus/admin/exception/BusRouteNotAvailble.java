package com.bus.admin.exception;

import org.springframework.stereotype.Component;

@Component
public class BusRouteNotAvailble extends Exception{

	public BusRouteNotAvailble(String msg) {
		
		super(msg);
	}
	
}
