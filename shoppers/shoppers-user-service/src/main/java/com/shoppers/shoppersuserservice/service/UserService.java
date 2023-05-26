package com.shoppers.shoppersuserservice.service;

import com.shoppers.shoppersuserservice.dto.UserRequestDto;
import com.shoppers.shoppersuserservice.model.UserEntity;
import com.shoppers.shoppersuserservice.repository.UserRepository;
import lombok.Builder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Builder
@Service
public class UserService implements UserDAO {

    @Autowired
    UserRepository userEntityRepository;

    public UserService() {
        super();
    }

    @Override
    public UserEntity saveUserEntity(UserRequestDto userDto) {
        UserEntity userEntity = new UserEntity();
        userEntity.setUserId((long) userDto.getUserId());
        userEntity.setUserName(userDto.getUserName());
        userEntity.setFirstName(userDto.getFirstName());
        userEntity.setLastName(userDto.getLastName());
        userEntity.setEmail(userDto.getEmail());
        userEntity.setMobile(userDto.getMobile());
        userEntityRepository.save(userEntity);
        return userEntity;
    }

    @Override
    public List<UserEntity> getAllUserEntity() {
        return userEntityRepository.findAll();
    }

    @Override
    public UserEntity getUser(String email) {
        return userEntityRepository.findByEmail(email);
    }

    @Override
    public UserEntity updateUser(String email, UserEntity updatedUser) {
        UserEntity userFromRepo = userEntityRepository.findByEmail(email);
        userFromRepo.setFirstName(updatedUser.getFirstName());
        userFromRepo.setLastName(updatedUser.getLastName());
        userFromRepo.setUserName(updatedUser.getUserName());
        userFromRepo.setMobile(updatedUser.getMobile());
        userEntityRepository.save(userFromRepo);
        return userFromRepo;
    }

    @Override
    public void deleteUser(String email) {
        UserEntity userToDelete = userEntityRepository.findByEmail(email);
        if (userToDelete != null) {
            userEntityRepository.delete(userToDelete);
        } else {
            throw new IllegalArgumentException("User not found with email: " + email);
        }
    }
}
