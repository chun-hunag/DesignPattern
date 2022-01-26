
public class LetterProcessImpl implements ILetterProcess {
    //寫信
    public void writeContext(String context) {
        System.out.println("填寫信的內容..." + context);
    }
    //在信封上填寫必要的信息
    public void fillEnvelope(String address) {
        System.out.println("填寫收件人地址及姓名..." + address);
    }
    //把信放到信封中，並封好
    public void letterInotoEnvelope() {
        System.out.println("把信放到信封中...");
    }
    //塞到郵箱中，郵遞
    public void sendLetter() {
        System.out.println("郵遞信件...");
    }
}