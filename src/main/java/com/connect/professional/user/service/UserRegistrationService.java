package com.connect.professional.user.service;

import com.connect.professional.user.dto.UserDTO;
import com.connect.professional.user.dto.UserRegistrationDTO;
import com.connect.professional.user.exception.ActivationException;
import com.connect.professional.user.exception.PasswordResetException;
import com.connect.professional.user.exception.RegistrationException;
import com.connect.professional.user.exception.ResendActivationException;

public interface UserRegistrationService {


    UserDTO registerUser(UserRegistrationDTO registrationDTO) throws RegistrationException;

}


