
public abstract class Decorator extends SchoolReport {
    //首先我要知道是哪個成績單
    private SchoolReport sr;
    //構造函數，傳遞成績單過來
    public Decorator(SchoolReport sr) {
        this.sr = sr;
    }
    //成績單還是要被看到的
    public void report() {
        this.sr.report();
    }
    //看完還是要簽名的
    public void sign(String name) {
        this.sr.sign(name);
    }
}