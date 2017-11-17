public class MailInfo {
    private Client client;
    private MailCode mailCode;
    private String text;
    public MailInfo(Client client, MailCode mailCode, String text){
        this.client = client;
        this.mailCode = mailCode;
        this.text = text;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public MailCode getMailCode() {
        return mailCode;
    }

    public void setMailCode(MailCode mailCode) {
        this.mailCode = mailCode;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
