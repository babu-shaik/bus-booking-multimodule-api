package com.bus.admin.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class BusRoutes {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	private String routeNumber;
	private String source;
	private String destination;
	private String soruceDestination;
	private boolean availability;
	public BusRoutes() {
		super();
	}
	public BusRoutes(int id, String routeNumber, String source, String destination, String soruceDestination,
			boolean availability) {
		super();
		this.id = id;
		this.routeNumber = routeNumber;
		this.source = source;
		this.destination = destination;
		this.soruceDestination = soruceDestination;
		this.availability = availability;
	}
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getRouteNumber() {
		return routeNumber;
	}
	public void setRouteNumber(String routeNumber) {
		this.routeNumber = routeNumber;
	}
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	public String getSoruceDestination() {
		return soruceDestination;
	}
	public void setSoruceDestination(String soruceDestination) {
		this.soruceDestination = soruceDestination;
	}
	public boolean isAvailability() {
		return availability;
	}
	public void setAvailability(boolean availability) {
		this.availability = availability;
	}
	
	@Override
	public String toString() {
		return "BusRoutes [id=" + id + ", routeNumber=" + routeNumber + ", source=" + source + ", destination="
				+ destination + ", soruceDestination=" + soruceDestination + ", availability=" + availability + "]";
	}
	
	
	
	
	
}
