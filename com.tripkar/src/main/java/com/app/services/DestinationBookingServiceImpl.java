package com.app.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.dao.DestinationBookingRepository;
import com.app.pojos.DestinationBooking;


@Service
@Transactional
public class DestinationBookingServiceImpl implements IDestinationBookingService{

	//dependency:dao layer i/f
	@Autowired 
	private DestinationBookingRepository bookingRepo;
	
	@Override
	public List<DestinationBooking> getAllBooking() {
		
		return bookingRepo.findAll();
	}

	@Override
	public DestinationBooking addBooking(DestinationBooking booking) {
		
		return bookingRepo.save(booking);
	}

	@Override
	public String deleteBooking(long id) {
		bookingRepo.deleteById(id);
		return "Destination Booking Details  deleted for ID= "+id;
	}

}