package com.item.javaee.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;

/**
 * @ClassName: MailService
 * @Description TODO
 * @Author: jff
 * @Date: 2019-11-05 00:06
 * @Version: 1.0
 **/
@Service
public class MailService {

    @Value("${mail.from}")
    private String mailFrom ;
    @Autowired
    private JavaMailSender mailSender ;
    public void sendHtmlMsg(String to, String htmlMsg) throws MessagingException {
        MimeMessage msg = mailSender.createMimeMessage() ;

        MimeMessageHelper msgHelper = new MimeMessageHelper(msg) ;

        msg.setSubject("博客验证码") ;
        msgHelper.setText(htmlMsg, true) ;

        //发送消息
        msgHelper.setFrom(mailFrom) ;
        msgHelper.setTo(to) ;

        mailSender.send(msg) ;
    }
}
