package com.habib.sprint5.service;

import com.habib.sprint5.mail.Mail;

public interface MailService {
    void sendMail(String email, Mail mail);
}
