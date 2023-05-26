package com.shoppers.shoppersuserservice.service;


import com.shoppers.shoppersuserservice.dto.UserRequestDto;
import com.shoppers.shoppersuserservice.model.UserEntity;

import java.util.List;

public interface UserDAO {

    UserEntity saveUserEntity(UserRequestDto userDto);

    List<UserEntity> getAllUserEntity();

    UserEntity getUser(String email);

    UserEntity updateUser(String email, UserRequestDto updatedUser);

    void deleteUser(String email);


}
