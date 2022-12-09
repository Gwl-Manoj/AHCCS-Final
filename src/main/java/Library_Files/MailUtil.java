package Library_Files;

import java.util.Properties;

import javax.activation.DataHandler;
import javax.activation.DataSource;
import javax.activation.FileDataSource;
import javax.mail.Authenticator;
import javax.mail.BodyPart;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Multipart;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;

public class MailUtil {

	private static Object getMailBody(String desc) {
		return "Hi All," + "<br/><br/>" + desc;
	}
	
	public static void sendNotificationMail(String desc) {

		
		final String username = "ravish.soni@galaxyweblinks.in";
		final String password = "coolrock123New";

		Properties props = new Properties();
		props.put("mail.smtp.auth", "true");
		props.put("mail.smtp.starttls.enable", "true");
		props.put("mail.smtp.host", "mx1.galaxyweblinks.in"); 
		props.put("mail.smtp.port", "587"); 

		Session session = Session.getInstance(props, new Authenticator() {
			protected PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication(username, password);
			}
		});

		try {

			Message message = new MimeMessage(session);
			message.setFrom(new InternetAddress(username));

			message.setRecipients(Message.RecipientType.TO,	InternetAddress.parse("manoj.sirsat@galaxyweblinks.in"));
			message.setSubject("Automation Execution Report "+ desc);

			// Attaching the html file
			BodyPart messageBodyPart = new MimeBodyPart();
			messageBodyPart.setContent(desc, "text/html");

			Multipart multipart = new MimeMultipart();
			multipart.addBodyPart(messageBodyPart);

			// In case the files size is very large then we will just send the
			// notification mail w/o attaching the reports
			try {

				// In case the HTML report file is not found
				try {
					messageBodyPart = new MimeBodyPart();
//					String filepath = System.getProperty("user.dir")+"/target/surefire-reports/emailable-report.html";
					String filepath = System.getProperty("user.dir")+"/target/surefire-reports/Suite/Test.html"; //TODO give file path
					//String filepath = System.getProperty("user.dir")+"/ExtentReports/TestReports.html"; //TODO give file path
					DataSource source = new FileDataSource(filepath);
					messageBodyPart.setDataHandler(new DataHandler(source));
					messageBodyPart.setFileName("EmailableReport.html");
					multipart.addBodyPart(messageBodyPart);
				} catch (Exception ee) {
					ee.printStackTrace();
				}

				// Send the complete message parts
				message.setContent(multipart);
				Transport.send(message);
				System.out.println("Mail Sent, With Attachments");
			} catch (Exception ee) {
				Message messageWoAttchment = new MimeMessage(session);
				messageWoAttchment.setFrom(new InternetAddress(username));

				messageWoAttchment.setRecipients(Message.RecipientType.TO,
						InternetAddress.parse("manoj.sirsat@galaxyweblinks.in"));
				
				messageWoAttchment
						.setSubject("Notification of Automated test execution on " + desc);

				// Attaching the html file
				BodyPart messageBodyPartWoAttachment = new MimeBodyPart();
				messageBodyPartWoAttachment.setContent(getMailBody(desc), "text/html");

				Multipart multipartWoAttachment = new MimeMultipart();
				multipartWoAttachment.addBodyPart(messageBodyPartWoAttachment);

				// Send the complete message parts
				messageWoAttchment.setContent(multipartWoAttachment);
				Transport.send(messageWoAttchment);
				System.out.println("Mail Sent, W/O Attachments");
			}

		} catch (MessagingException e) {
				e.printStackTrace();
		} 
	}
	
}
