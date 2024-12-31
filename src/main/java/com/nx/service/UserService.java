package com.nx.service;

import com.nx.dto.UserDto;
import com.nx.entity.User;

import java.util.List;

public interface UserService {
    void saveUser(UserDto userDto);

    User findByEmail(String email);

    List<UserDto> findAllUsers();
}
