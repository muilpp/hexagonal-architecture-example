package port.notification;

public interface MailSender {

    boolean sendEmail(String to, String subject, String text);
}
