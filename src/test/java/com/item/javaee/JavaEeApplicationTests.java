package com.item.javaee;

import com.item.javaee.entity.User;
import com.item.javaee.repository.UserRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;
import java.util.List;

@SpringBootTest
@RunWith(SpringJUnit4ClassRunner.class)
public class JavaEeApplicationTests {

    @Autowired
    ApplicationContext context ;

    @Autowired
    UserRepository userRepository ;

    @Test
    public void contextLoads() {
        List<User> userList = userRepository.findAll();

        userList.forEach(user -> {
            System.out.println("-------") ;
            System.out.println(user) ;
            System.out.println("-------") ;
        }) ;
    }


    @Autowired
    JavaMailSender mailSender ;

    //测试发邮件
    @Test
    public void sendSimpleMail() {
        SimpleMailMessage msg = new SimpleMailMessage() ;

        msg.setSubject("放假通知") ;

        msg.setText("国庆节放假7天") ;

        msg.setFrom("2243883304@qq.com") ;
        msg.setTo("1043610384@qq.com") ;

        mailSender.send(msg) ;
    }

    @Test
    public void testHTMLMsg() throws MessagingException {
        MimeMessage mimeMessage = mailSender.createMimeMessage() ;

        MimeMessageHelper msgHelper = new MimeMessageHelper(mimeMessage) ;

        msgHelper.setSubject("傻子") ;

        String html = "你好, 您在博客申请的验证码为xxxxxx" ;
        msgHelper.setText("<p>" + html + "</p>", true) ;

        msgHelper.setFrom("2243883304@qq.com") ;
        msgHelper.setTo("1043610384@qq.com") ;

        mailSender.send(mimeMessage) ;

    }
}
