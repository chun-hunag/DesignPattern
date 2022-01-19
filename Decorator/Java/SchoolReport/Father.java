
public class Father {
    public static void main(String[] args) {
        //把成績單拿過來
        SchoolReport sr;
        //原裝的成績單
        sr = new FourthGradeSchoolReport();
        //加了最高分說明的成績單
        sr = new HighScoreDecorator(sr);
        //又加了成績排名的說明
        sr = new SortDecorator(sr);
        //看成績單
        sr.report();
        //然後老爸一看，很開心，就簽名了
        sr.sign("老三"); //我叫小三，老爸當然叫老三
    }
}