package com.avinashbitra.events.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.MailSender;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.stereotype.Controller;

@Controller
public class EmailController {

  @Autowired
  private MailSender crunchifymail;

  public void sendEmail(){
    SimpleMailMessage crunchifyMsg = new SimpleMailMessage();
    crunchifyMsg.setFrom("info@avinashbitra.com");
    crunchifyMsg.setTo("avibitra@gmail.com");
    crunchifyMsg.setSubject("TEST");
    crunchifyMsg.setText("Test Message");
    crunchifymail.send(crunchifyMsg);
  }
}
