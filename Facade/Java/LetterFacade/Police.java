
public class Police {
    //檢查信件，檢查完畢後警察在信封上蓋個戳：此信無病毒
    public void checkLetter(ILetterProcess letterProcess) {
        System.out.println(letterProcess + " 信件已經檢查過了...");
    }
}