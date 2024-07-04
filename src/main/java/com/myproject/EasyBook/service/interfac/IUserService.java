package com.myproject.EasyBook.service.interfac;

import com.myproject.EasyBook.dto.LoginRequest;
import com.myproject.EasyBook.dto.Response;
import com.myproject.EasyBook.entity.User;

public interface IUserService {

    Response register(User user);

    Response login(LoginRequest loginRequest);

    Response getAllUsers();

    Response getUserBookingHistory(String userId);

    Response deleteUser(String userId);

    Response getUserById(String userId);

    Response getMyInfo(String email);
}
