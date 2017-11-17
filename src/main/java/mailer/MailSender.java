package mailer;

public class MailSender {
    public static void sendMail(MailInfo mailInfo) throws MailNotSentException{
        boolean success;
        success = mailInfo.getClient().isReal();

        if (success)
            System.out.println("Mail sent successfully");
        else
            throw new MailNotSentException();
    }
}
