package com.aurorashop.util;

import java.io.UnsupportedEncodingException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Component;

import jakarta.mail.MessagingException;
import jakarta.mail.internet.MimeMessage;
import jakarta.servlet.http.HttpServletRequest;

@Component
public class CommonUtil {
	
	@Autowired
	private JavaMailSender mailSender;
	
	public Boolean sendMail(String url, String receipentEmail) throws UnsupportedEncodingException, MessagingException {
		
		MimeMessage message = mailSender.createMimeMessage();
		MimeMessageHelper helper = new MimeMessageHelper(message);
		
		helper.setFrom("nguyenngocvan.qng@gmail.com","AURORA-STORE");
		helper.setTo(receipentEmail);
		
		String content= "<p>Xin chào, mật khẩu của bạn đã được reset.</p>" 
				+ "<p>Click vào link bên dưới để thay đổi mật khẩu: </p>" 
				+"<p><a href=\"" + url + "\">Thay đổi mật khẩu</a></p>";
		helper.setSubject("Thay đổi mật khẩu");
		helper.setText(content, true);
		mailSender.send(message);
		
		return true;
	}

	public static String generateUrl(HttpServletRequest request) {
		String siteURL = request.getRequestURL().toString();
		return siteURL.replace(request.getServletPath(),"");
	}

}
