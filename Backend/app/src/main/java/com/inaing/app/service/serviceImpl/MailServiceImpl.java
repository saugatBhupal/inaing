package com.inaing.app.service.serviceImpl;

import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import com.inaing.app.service.MailService;

import jakarta.mail.internet.MimeMessage;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class MailServiceImpl implements MailService{
    private final JavaMailSender mailSender;

    private void sendMail(String to, String subject, String body){
        SimpleMailMessage message = new SimpleMailMessage();
        message.setTo(to);
        message.setFrom("Inaing@sbhupal.com.np");
        message.setSubject(subject);
        message.setText(body);
        System.out.println(message.getText());
        mailSender.send(message);
    }
    
    @Override
public void sendVerificationMail(String to, String name, String link) {
    String body = 
        "Verify Your Inaing Account - Your Verification Link Inside\n" +
        "Hello " + name + ",\n\n" +
        "Welcome to Inaing! We're thrilled to have you on board. To ensure the security of your account, we need to verify your email address. Please use the following verification link:\n\n" +
        link + "\n\n" +
        "Simply click on the link to complete the process.\n\n" +
        "If you didn't sign up for Inaing or have any concerns about this email, please let us know immediately. Your security is our top priority.\n\n" +
        "Thanks for choosing Inaing. We can't wait for you to start using our platform!\n\n" +
        "Best,\n" +
        "The Inaing Team";
    String subject = "Inaing : Verify your E-Mail Account";

    sendMail(to, subject, body);
}

    
}
