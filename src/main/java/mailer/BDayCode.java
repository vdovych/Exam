package mailer;

public class BDayCode implements MailCode{

    public String format(String text, Client client) {
        return "Happy birthday dear"+client.getName()+text;
    }
}
