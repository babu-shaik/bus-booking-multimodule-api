package com.bus.admin.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
<<<<<<< HEAD
import org.springframework.web.bind.annotation.RequestParam;
=======
>>>>>>> 7a3f1218c34d3eca49fc4ebe65aeca6ab14e2403
import org.springframework.web.bind.annotation.RestController;

import com.bus.admin.model.BusRoutes;

@RestController
@RequestMapping("api/v1/bus/admin")
public class BusAdminController {
	
	@RequestMapping("/saveRoute")
	public ResponseEntity<BusRoutes> saveOrUpdateRoutes(@RequestBody BusRoutes routes){
<<<<<<< HEAD
		
=======
		System.out.println("insave");
>>>>>>> 7a3f1218c34d3eca49fc4ebe65aeca6ab14e2403
		
		return null;
		
		
	}

	@RequestMapping("/allRoutes")
	public List<BusRoutes> findAllRoutes(){
		
		return null;
	}
<<<<<<< HEAD
	
	@RequestMapping("/findRoute/{name}")
	public String findByRoute(@RequestParam("name") String name) {
		System.out.println("infindbyroute");
		return null;
	}
	
=======
>>>>>>> 7a3f1218c34d3eca49fc4ebe65aeca6ab14e2403
}
