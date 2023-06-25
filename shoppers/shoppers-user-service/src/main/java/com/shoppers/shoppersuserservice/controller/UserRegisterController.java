package com.shoppers.shoppersuserservice.controller;


import com.shoppers.shoppersuserservice.dto.RegistrationRequest;
import com.shoppers.shoppersuserservice.service.RegistrationService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api/v1/user-signup")
@AllArgsConstructor
public class UserRegisterController {

    private RegistrationService registrationService;
    @PostMapping(path = "/user")
    public String register(@RequestBody RegistrationRequest request){
        return registrationService.register(request);
    }

}
