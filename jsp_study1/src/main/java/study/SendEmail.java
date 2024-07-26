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
		// ���Ǳ� ��ϵǸ� ������ �̸��Ϸ� �����ϱ�
		
		// ������ �̸��� ���� ����
		final String adminEmail = "chami927";
		final String password = "";
		
		// ������ �̸��� ȯ�漳�� ���
		Properties prop = new Properties();
		prop.put("mail.smtp.host", "smtp.naver.com");  // smtp ������
		prop.put("mail.smtp, port", "587");  // smtp ��Ʈ ��ȣ
		prop.put("mail.smtp.starttls.enable", "true");  // tls ��� ����
		prop.put("mail.smtp.auth", "true");  // smtp ���� ����
		
		// ���Ǳ��� ��ϵǸ� ������ �̸��Ϸ� ���۵Ǿ�� �Ѵ�.
		// ������ ����� �޴� ����� �ʿ��ѵ�
		// ������ ����� Ŭ���̾�Ʈ������ ���� Ŭ���̾�Ʈ ���Ͽ��� �߼۵Ǵ� �� �ƴϰ�
		// �ڹٿ��� �߼��ϴ� ���̱� ������ �����ڰ� ������ �Ű��ؾ� �Ѵ�.
		Session adminAuth = Session.getInstance(prop,
				new javax.mail.Authenticator(){
					protected PasswordAuthentication getPasswordAuthentication() {
						return new PasswordAuthentication(adminEmail, password);
					}
				});  // ������ �̸��� �α��� ����
		
		try {
			MimeMessage msg = new MimeMessage(adminAuth);
			msg.setFrom(new InternetAddress(adminEmail));  // ������ �̸��� �ּ�
			msg.setRecipients(Message.RecipientType.TO, InternetAddress.parse(adminEmail));  // �޴� �̸��� �ּ�
			
			msg.setHeader("Content-Type", "text/html;charset=utf-8");
			
			msg.setSubject("���� �� ��� [ " + title + "]-" + fromEmail);  // �̸��� ����
			msg.setText("<h3>���� ����</h3> <b>" + content +
					"</b> <div> <a href='http://localhost:8080//study/?part=inquiry'>���Ǳ� Ȯ��</a> </div>", "text/html;charset=utf-8");  // �̸��� ����
			Transport.send(msg);  // ���� ����
		}catch(MessagingException e) {
			e.printStackTrace();
			System.out.println("�̸��� ���� ����");
		}
	}

}
