package com.mail_impl.service;

import com.mail_impl.Entity.EmailDetails;

public interface EmailService {

	
    String sendSimpleMail(EmailDetails details);
    String sendMailWithAttachment(EmailDetails details);
}
