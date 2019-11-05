package com.cg.cabbookingsystem.dto;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
public class Driver {
	
	@Id
	private int id;
	@Column(length = 15)
	private String name;
	private Date dob;
	@Column(length = 15)
	private String gender;
	private long contactNo;
	@Column(length = 15)
	private String address;
	@Column(length = 15)
	private String vehicleNo;
	private double rating;
	private int numberOfTrips;
	
	public Driver() {
	}

	public Driver(int id, String name, Date dob, String gender, long contactNo, String address, String vehicleNo,
			double rating, int numberOfTrips) {
		this.id = id;
		this.name = name;
		this.dob = dob;
		this.gender = gender;
		this.contactNo = contactNo;
		this.address = address;
		this.vehicleNo = vehicleNo;
		this.rating = rating;
		this.numberOfTrips = numberOfTrips;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public long getContactNo() {
		return contactNo;
	}

	public void setContactNo(long contactNo) {
		this.contactNo = contactNo;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getVehicleNo() {
		return vehicleNo;
	}

	public void setVehicleNo(String vehicleNo) {
		this.vehicleNo = vehicleNo;
	}

	public double getRating() {
		return rating;
	}

	public void setRating(double rating) {
		this.rating = rating;
	}

	public int getNumberOfTrips() {
		return numberOfTrips;
	}

	public void setNumberOfTrips(int numberOfTrips) {
		this.numberOfTrips = numberOfTrips;
	}
}
