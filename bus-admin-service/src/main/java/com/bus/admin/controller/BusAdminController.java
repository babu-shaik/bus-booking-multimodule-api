package com.bus.admin.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.bus.admin.model.BusRoutes;

@RestController
@RequestMapping("api/v1/bus/admin")
public class BusAdminController {
	
	@RequestMapping("/saveRoute")
	public ResponseEntity<BusRoutes> saveOrUpdateRoutes(@RequestBody BusRoutes routes){

		System.out.println("insave");

		
		return null;
		
		
	}

	@RequestMapping("/allRoutes")
	public List<BusRoutes> findAllRoutes(){
		System.out.println("frm hp121");
		return null;
	}

	
	@RequestMapping("/findRoute/{name}")
	public String findByRoute(@RequestParam("name") String name) {
		System.out.println("infindbyroute");
		System.out.println("chnges from hp");
		System.out.println("from dell");
		return null;
	}
	
}
