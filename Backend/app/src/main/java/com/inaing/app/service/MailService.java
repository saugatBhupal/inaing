package com.inaing.app.service;

public interface MailService {
    void sendVerificationMail(String to, String name, String link);
}
