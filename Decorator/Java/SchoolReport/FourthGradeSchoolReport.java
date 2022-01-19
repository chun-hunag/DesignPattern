
public class FourthGradeSchoolReport extends SchoolReport {
    //我的成績單
    public void report() {
        //成績單的格式是這個樣子的
        System.out.println("尊敬的XXX家長:");
        System.out.println(" ......");
        System.out.println(" 語文 62 數學65 體育 98 自然 63");
        System.out.println(" .......");
        System.out.println(" 家長簽名： ");
    }
    //家長簽名
    public void sign(String name) {
        System.out.println("家長簽名為：" + name);
    }
}