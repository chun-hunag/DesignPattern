
public class ModernPostOffice {
    private ILetterProcess letterProcess;
    private Police letterPolice;

    public ModernPostOffice() {
        this.letterProcess = new LetterProcessImpl();
        this.letterPolice = new Police();
    }

    //寫信，封裝，投遞，一體化了
    public void sendLetter(String context, String address) {
        //幫你寫信
        letterProcess.writeContext(context);
        //寫好信封
        letterProcess.fillEnvelope(address);
        //警察要檢查信件了
        letterPolice.checkLetter(letterProcess);
        //把信放到信封中
        letterProcess.letterInotoEnvelope();
        //郵遞信件
        letterProcess.sendLetter();
    }
}