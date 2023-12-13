package com.connect.professional.user.controller;

import com.connect.professional.user.dto.UserDTO;
import com.connect.professional.user.dto.UserRegistrationDTO;
import com.connect.professional.user.service.UserRegistrationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/register")
public class UserRegistrationController {

    private final UserRegistrationService userRegistrationService;

    @Autowired
    public UserRegistrationController(UserRegistrationService userRegistrationService) {
        this.userRegistrationService = userRegistrationService;
    }

    @PostMapping("/user")
    public ResponseEntity<UserDTO> registerUser(@RequestBody UserRegistrationDTO registrationDTO) {

        return new ResponseEntity<>(userRegistrationService.registerUser(registrationDTO), HttpStatus.CREATED);
    }

}
