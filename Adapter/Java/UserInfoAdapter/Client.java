public class Client {
    public static void main(String[] args) {
        //老闆一想不對呀，兔子不吃窩邊草，還是找借用人員好點
        //我們只修改了這句話
        IUserInfo youngGirl = new OuterUserInfo();
        //從數據庫中查到101個
        for (int i = 0; i < 101; i++) {
            youngGirl.getMobileNumber();
        }
    }
}