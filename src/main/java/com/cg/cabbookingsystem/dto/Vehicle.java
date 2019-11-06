package com.cg.cabbookingsystem.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Vehicle {

	@Id
	private String vehicleNo;
	private int vehicleSize;
	@Column(length = 15)
	private String model;
	@Column(length = 15)
	private String status;
	@Column(length = 15)
	private String location;
	
	public Vehicle() {
	}
	
	public Vehicle(String vehicleNo, int vehicleSize, String model, String status, String location) {
		this.vehicleNo = vehicleNo;
		this.vehicleSize = vehicleSize;
		this.model = model;
		this.status = status;
		this.location = location;
	}

	public String getVehicleNo() {
		return vehicleNo;
	}
	public void setVehicleNo(String vehicleNo) {
		this.vehicleNo = vehicleNo;
	}
	public int getSize() {
		return vehicleSize;
	}
	public void setSize(int size) {
		this.vehicleSize = size;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	
	
}
