
public class HighScoreDecorator extends Decorator {
    //構造函數
    public HighScoreDecorator(SchoolReport sr) {
        super(sr);
    }
    //我要匯報最高成績
    private void reportHighScore() {
        System.out.println("這次考試語文最高是75，數學是78，自然是80");
    }
    //我要在老爸看成績單前告訴他最高成績，否則等他一看，就掄起掃帚揍我，我哪裡還有機會說啊
    @Override
    public void report() {
        this.reportHighScore();
        super.report();
    }
}