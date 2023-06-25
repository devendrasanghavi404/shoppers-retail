package com.shoppers.shoppersuserservice.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.shoppers.shoppersuserservice.dao.UserDAO;
import com.shoppers.shoppersuserservice.dto.UserRequestDto;
import com.shoppers.shoppersuserservice.model.Roles;
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

    @Override
    public UserEntity saveUserEntity(UserRequestDto userDto) {
        UserEntity userEntity = new UserEntity();
        System.err.println(userDto);
        userEntity.setUserId((long) userDto.getUserId());
        userEntity.setUserName(userDto.getUserName());
        userEntity.setFirstName(userDto.getFirstName());
        userEntity.setLastName(userDto.getLastName());
        ObjectMapper mapper = new ObjectMapper();
        String role = userDto.getRoles();
        if (role.equals("USER")) {

            userEntity.setRoles(Roles.USER);
        } else {
            userEntity.setRoles(Roles.ADMIN);
        }

        userEntity.setEmail(userDto.getEmail());
        userEntity.setMobile(userDto.getMobile());
        System.err.println(userEntity);
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
    public UserEntity updateUser(String email, UserRequestDto updatedUser) {
        UserEntity userFromRepo = userEntityRepository.findByEmail(email);
        userFromRepo.setFirstName(updatedUser.getFirstName());
        userFromRepo.setLastName(updatedUser.getLastName());
        userFromRepo.setUserName(updatedUser.getUserName());
        userFromRepo.setRoles(Roles.valueOf(updatedUser.getRoles()));
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
