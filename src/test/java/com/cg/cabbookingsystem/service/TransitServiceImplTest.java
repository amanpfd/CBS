/**
 * 
 */
package com.cg.cabbookingsystem.service;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.cg.cabbookingsystem.dto.Booking;
import com.cg.cabbookingsystem.dto.Driver;
import com.cg.cabbookingsystem.dto.Vehicle;
import com.cg.cabbookingsystem.exception.InvalidBookingException;

/**
 * @author Aman Dungarwal
 * @version 1.0
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class TransitServiceImplTest {

	@Autowired
	TransitService transitService;

	/**
	 * Test method for
	 * {@link com.cg.cabbookingsystem.service.TransitServiceImpl#startTrip(com.cg.cabbookingsystem.dto.Booking)}.
	 */
	@Test
	public void testStartTrip() {
		Booking booking = new Booking();
		booking = transitService.startTrip(booking);
		assertEquals("Started", booking.getTripStatus());
	}

	/**
	 * Test method for
	 * {@link com.cg.cabbookingsystem.service.TransitServiceImpl#endTrip(com.cg.cabbookingsystem.dto.Booking)}.
	 * 
	 * @throws InvalidBookingException
	 */
	@Test
	public void testEndTrip() throws InvalidBookingException {
		Booking booking = new Booking();
		booking = transitService.endTrip(booking);
		Booking expectedBooking = new Booking();
		assertEquals(expectedBooking, booking);
	}

	/**
	 * Test method for
	 * {@link com.cg.cabbookingsystem.service.TransitServiceImpl#endTrip(com.cg.cabbookingsystem.dto.Booking)}.
	 * 
	 * @throws InvalidBookingException
	 */
	@Test(expected = InvalidBookingException.class)
	public void testEndTripNegative() throws InvalidBookingException {
		Booking booking = new Booking();
		booking = transitService.endTrip(booking);
		Booking expectedBooking = new Booking();
		assertEquals(expectedBooking, booking);
	}

	/**
	 * Test method for
	 * {@link com.cg.cabbookingsystem.service.TransitServiceImpl#updateDriverRating(com.cg.cabbookingsystem.dto.Booking)}.
	 * 
	 * @throws InvalidBookingException
	 */
	@Test
	public void testUpdateDriverRating() throws InvalidBookingException {
		Booking booking = new Booking();
		Driver driver = transitService.updateDriverRating(booking);
		assertEquals(5.0, driver.getRating(), 0);
	}

	/**
	 * Test method for
	 * {@link com.cg.cabbookingsystem.service.TransitServiceImpl#updateDriverRating(com.cg.cabbookingsystem.dto.Booking)}.
	 * 
	 * @throws InvalidBookingException
	 */
	@Test(expected = InvalidBookingException.class)
	public void testUpdateDriverRatingNegative() throws InvalidBookingException {
		Booking booking = new Booking();
		System.out.println(transitService);
		Driver driver = transitService.updateDriverRating(booking);
		assertEquals(5.0, driver.getRating(), 0);
	}

	/**
	 * Test method for
	 * {@link com.cg.cabbookingsystem.service.TransitServiceImpl#updateVehicleStatus(com.cg.cabbookingsystem.dto.Booking, com.cg.cabbookingsystem.dto.Driver)}.
	 * 
	 * @throws InvalidBookingException
	 */
	@Test
	public void testUpdateVehicleStatus() throws InvalidBookingException {
		Booking booking = new Booking();
		Driver driver = new Driver();
		Vehicle vehicle = transitService.updateVehicleStatus(booking, driver);
	}

	/**
	 * Test method for
	 * {@link com.cg.cabbookingsystem.service.TransitServiceImpl#finalFareGeneration(com.cg.cabbookingsystem.dto.Booking, com.cg.cabbookingsystem.dto.Vehicle)}.
	 * 
	 * @throws InvalidBookingException
	 */
	@Test
	public void testFinalFareGeneration() throws InvalidBookingException {
		Booking booking = new Booking();
		Vehicle vehicle = new Vehicle();
		double finalFare = transitService.finalFareGeneration(booking, vehicle);
	}

}
