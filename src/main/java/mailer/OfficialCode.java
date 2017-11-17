package mailer;

public class OfficialCode implements MailCode {

    public String format(String text, Client client) {
        return client.isSex()?"Mr.":"Ms."+client.getName()+text;
    }
}
