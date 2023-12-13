package com.connect.professional.user.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class UserRegistrationDTO {

    private String username;
    private String password;
    private String email;
    private String fullName;
}
