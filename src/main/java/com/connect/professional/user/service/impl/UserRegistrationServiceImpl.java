package com.connect.professional.user.service.impl;

import com.connect.professional.user.dto.UserDTO;
import com.connect.professional.user.exception.ActivationException;
import com.connect.professional.user.exception.RegistrationException;
import com.connect.professional.user.repository.UserRepository;
import com.connect.professional.user.dto.UserRegistrationDTO;
import com.connect.professional.user.entity.User;
import com.connect.professional.user.service.EmailService;
import com.connect.professional.user.service.UserRegistrationService;
import org.springframework.stereotype.Service;

@Service
public class UserRegistrationServiceImpl implements UserRegistrationService {

    private UserRepository userRepository;
    public UserRegistrationServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }
    @Override
    public UserDTO registerUser(UserRegistrationDTO registrationDTO) throws RegistrationException {
        User newUser = new User();
        newUser.setUsername(registrationDTO.getUsername());
        newUser.setPassword(registrationDTO.getPassword());
        newUser.setEmail(registrationDTO.getEmail());
        newUser.setFullName(registrationDTO.getFullName());
        User user = userRepository.save(newUser);
        UserDTO userDTO = new UserDTO();
        userDTO.setUsername(user.getUsername());
        userDTO.setPassword(user.getPassword());
        userDTO.setEmail(user.getEmail());
        userDTO.setFullName(user.getFullName());
        userDTO.setId(user.getId());
        return userDTO;
    }

}
