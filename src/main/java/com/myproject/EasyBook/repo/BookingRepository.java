package com.myproject.EasyBook.repo;

import com.myproject.EasyBook.entity.Booking;
import com.myproject.EasyBook.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;
public interface BookingRepository extends JpaRepository<Booking, Long> {

    Optional<Booking> findByBookingConfirmationCode(String confirmationCode);
}
