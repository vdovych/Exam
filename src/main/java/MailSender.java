public class MailSender {
    public static void sendMail(MailInfo mailInfo) throws MailNotSentException{
        boolean success = false;
        success = mailInfo.getClient().isReal();
        //Sending email
        if (success)
            System.out.println("Mail sent successfully");
        else
            throw new MailNotSentException();
    }
}
