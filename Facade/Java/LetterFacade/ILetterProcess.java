
public interface ILetterProcess {
    //首先要寫信的內容
    public void writeContext(String context);
    //其次寫信封
    public void fillEnvelope(String address);
    //把信放到信封里
    public void letterInotoEnvelope();
    //然後郵遞
    public void sendLetter();
}