package com.connect.professional.user.service;

import org.springframework.stereotype.Service;

public interface EmailService {
    void sendActivationEmail(String to, String activationToken);

    void sendPasswordResetEmail(String to, String resetToken);
}
