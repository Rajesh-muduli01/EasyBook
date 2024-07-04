package com.myproject.EasyBook.service.interfac;

import com.myproject.EasyBook.dto.Response;
import com.myproject.EasyBook.entity.Booking;

public interface IBookingService {

    Response saveBooking(Long roomId, Long userId, Booking bookingRequest);

    Response findBookingByConfirmationCode(String confirmationCode);

    Response getAllBookings();

    Response cancelBooking(Long bookingId);
}
