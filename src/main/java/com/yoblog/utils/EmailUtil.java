package com.yoblog.utils;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Component;

/**
 * 邮件工具类
 * @Author 章学魁
 */
@Component
public class EmailUtil {
    @Autowired
    JavaMailSender javaMailSender;

    /**
     *
     * @param title 邮件标题
     * @param content 邮件正文
     */
    public void sendCode(String title, String content,String sengTo) {
        SimpleMailMessage message = new SimpleMailMessage();
        message.setSubject(title);
        message.setFrom("hellozachary@163.com");
        message.setTo(sengTo);
        message.setText(content);
        javaMailSender.send(message);
    }
}
