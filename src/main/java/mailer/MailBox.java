package mailer;

import java.util.LinkedList;
import java.util.List;

public class MailBox {
    private List<MailInfo> infos;
    public MailBox(){
        infos = new LinkedList<MailInfo>();
    }
    public void addMailInfo(MailInfo mailInfo){
        infos.add(mailInfo);
    }
    public void sendAll() throws MailNotSentException{
        for (MailInfo info:
             infos) {
            MailSender.sendMail(info);
        }
    }
}
