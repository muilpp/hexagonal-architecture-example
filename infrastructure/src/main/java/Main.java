import notification.FakeMail;
import port.notification.MailSender;

public class Main {
    public static void main(String[] args) {
        MailSender mailSender = new FakeMail();
        mailSender.sendEmail("muilpp@gmail.com","subject","text");
    }
}
