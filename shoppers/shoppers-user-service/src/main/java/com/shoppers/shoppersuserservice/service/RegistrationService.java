package com.shoppers.shoppersuserservice.service;

import com.shoppers.shoppersuserservice.dto.RegistrationRequest;
import com.shoppers.shoppersuserservice.model.AppUser;
import com.shoppers.shoppersuserservice.model.Roles;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class RegistrationService {

    private final AppUserService appUserService;
    private final EmailValidator emailValidator;
    public String register(RegistrationRequest request) {
        boolean isValidEmail = emailValidator.test(request.getEmail());
        if(!isValidEmail){
            throw new IllegalStateException("email not valid");
        }
        return appUserService.signUpUser(
                new AppUser(
                        request.getFirstName(),
                        request.getLastName(),
                        request.getEmail(),
                        request.getPassword(),
                        Roles.USER
                )
        );
    }
}
