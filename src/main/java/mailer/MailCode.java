package mailer;

public enum MailCode {
    SIMPLE,BDAY,NEWYEAR,HATEMAIL,OFFICIAL;

    @Override
    public String toString() {
        switch (this){
            case BDAY:return "Happy BirthDay, ";
            case NEWYEAR:return "Happy NewYear, ";
            case HATEMAIL:return "Listen here ";
            case OFFICIAL:return "Dr. ";
            default:return "Hi, ";
        }
    }
}
