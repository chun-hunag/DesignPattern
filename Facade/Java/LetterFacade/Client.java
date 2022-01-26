
public class Client {
    public static void main(String[] args) {
        //現代化的郵局，有這項服務，郵局名稱叫Hell Road
        ModernPostOffice hellRoadPostOffice = new ModernPostOffice();
        //你只要把信的內容和收信人地址給他，他會幫你完成一系列的工作
        //定義一個地址
        String address = "Happy Road No. 666,God Province,Heaven";
        //信的內容
        String context = "Hello,It's me,do you know who I am? I'm your old lover."; //你給我發送吧
        hellRoadPostOffice.sendLetter(context, address);
    }
}