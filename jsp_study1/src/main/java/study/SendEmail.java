package study;

import java.util.Properties;

import javax.mail.Message;
import javax.mail.MessageRemovedException;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class SendEmail {

	public void sendEmail(String fromEmail, String title, String content) {
		// 문의글 등록되면 관리자 이메일로 전송하기
		
		// 관리자 이메일 계정 설정
		final String adminEmail = "chami927";
		final String password = "";
		
		// 관리자 이메일 환경설정 등록
		Properties prop = new Properties();
		prop.put("mail.smtp.host", "smtp.naver.com");  // smtp 서버명
		prop.put("mail.smtp, port", "587");  // smtp 포트 번호
		prop.put("mail.smtp.starttls.enable", "true");  // tls 사용 여부
		prop.put("mail.smtp.auth", "true");  // smtp 서버 인증
		
		// 문의글이 등록되면 관리자 이메일로 전송되어야 한다.
		// 보내는 사람과 받는 사람이 필요한데
		// 보내는 사람은 클라이언트이지만 실제 클라이언트 메일에서 발송되는 게 아니고
		// 자바에서 발송하는 것이기 때문에 관리자가 보내고 신고해야 한다.
		Session adminAuth = Session.getInstance(prop,
				new javax.mail.Authenticator(){
					protected PasswordAuthentication getPasswordAuthentication() {
						return new PasswordAuthentication(adminEmail, password);
					}
				});  // 보내는 이메일 로그인 인증
		
		try {
			MimeMessage msg = new MimeMessage(adminAuth);
			msg.setFrom(new InternetAddress(adminEmail));  // 보내는 이메일 주소
			msg.setRecipients(Message.RecipientType.TO, InternetAddress.parse(adminEmail));  // 받는 이메일 주소
			
			msg.setHeader("Content-Type", "text/html;charset=utf-8");
			
			msg.setSubject("문의 글 등록 [ " + title + "]-" + fromEmail);  // 이메일 제목
			msg.setText("<h3>문의 내용</h3> <b>" + content +
					"</b> <div> <a href='http://localhost:8080//study/?part=inquiry'>문의글 확인</a> </div>", "text/html;charset=utf-8");  // 이메일 내용
			Transport.send(msg);  // 메일 전송
		}catch(MessagingException e) {
			e.printStackTrace();
			System.out.println("이메일 전송 실패");
		}
	}

}
