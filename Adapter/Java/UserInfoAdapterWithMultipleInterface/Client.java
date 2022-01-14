public class Client {
    public static void main(String[] args) {
        //外系統的人員信息
        IOuterUserBaseInfo baseInfo = new OuterUserBaseInfo();
        IOuterUserHomeInfo homeInfo = new OuterUserHomeInfo();
        IOuterUserOfficeInfo officeInfo = new OuterUserOfficeInfo();
        //傳遞三個對象
        IUserInfo youngGirl = new OuterUserInfo(baseInfo, homeInfo, officeInfo);
        //從數據庫中查到101個
        for (int i = 0; i < 101; i++) {
            youngGirl.getMobileNumber();
        }
    }
}