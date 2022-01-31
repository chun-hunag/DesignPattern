
public class SignInfo {
    //報名人員的ID
    private String id;
    //考試地點
    private String location;
    //考試科目
    private String subject;
    //郵寄地址
    private String postAddress;
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getLocation() {
        return location;
    }
    public void setLocation(String location) {
        this.location = location;
    }
    public String getSubject() {
        return subject;
    }
    public void setSubject(String subject) {
        this.subject = subject;
    }
    public String getPostAddress() {
        return postAddress;
    }
    public void setPostAddress(String postAddress) {
        this.postAddress = postAddress;
    }
}