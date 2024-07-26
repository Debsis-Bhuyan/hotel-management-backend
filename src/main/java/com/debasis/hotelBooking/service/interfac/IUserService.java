package com.debasis.hotelBooking.service.interfac;

import com.debasis.hotelBooking.dto.LoginRequest;
import com.debasis.hotelBooking.dto.Response;
import com.debasis.hotelBooking.entity.User;


public interface IUserService {
    Response register(User user);

    Response login(LoginRequest loginRequest);

    Response getAllUsers();

    Response getUserBookingHistory(String userId);

    Response deleteUser(String userId);

    Response getUserById(String userId);

    Response getMyInfo(String email);

}
