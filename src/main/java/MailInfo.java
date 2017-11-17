public class MailInfo {
    private Client client;
    private String recievingEmail;
    private MailCode mailCode;
    private String text;
    public MailInfo(Client client, String recievingEmail, MailCode mailCode, String text){
        this.client = client;
        this.recievingEmail = recievingEmail;
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
}
