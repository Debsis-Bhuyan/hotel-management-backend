package com.debasis.hotelBooking.service.interfac;

import com.debasis.hotelBooking.dto.Response;
import com.debasis.hotelBooking.entity.Booking;

public interface IBookingService {

    Response saveBooking(Long roomId, Long userId, Booking bookingRequest);

    Response findBookingByConfirmationCode(String confirmationCode);

    Response getAllBookings();

    Response cancelBooking(Long bookingId);

}
