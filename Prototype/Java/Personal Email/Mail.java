/** cloneable is a java built-in interface */
public class Mail implements Cloneable {
    //收件人
    private String receiver;
    //郵件名稱
    private String subject;
    //稱謂
    private String appellation;
    //郵件內容
    private String contxt;
    //郵件的尾部，一般都是加上"XXX版權所有"等信息
    private String tail;
    //構造函數
    public Mail(AdvTemplate advTemplate) {
        this.contxt = advTemplate.getAdvContext();
        this.subject = advTemplate.getAdvSubject();
    }
    @Override
    public Mail clone() {
        Mail mail = null;
        try {
            mail = (Mail) super.clone();
        } catch (CloneNotSupportedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return mail;
    }
    //以下為getter/setter方法
    public String getReceiver() {
        return receiver;
    }
    public void setReceiver(String receiver) {
        this.receiver = receiver;
    }
    public String getSubject() {
        return subject;
    }
    public void setSubject(String subject) {
        this.subject = subject;
    }
    public String getAppellation() {
        return appellation;
    }
    public void setAppellation(String appellation) {
        this.appellation = appellation;
    }
    public String getContxt() {
        return contxt;
    }
    public void setContxt(String contxt) {
        this.contxt = contxt;
    }
    public String getTail() {
        return tail;
    }
    public void setTail(String tail) {
        this.tail = tail;
    }
}