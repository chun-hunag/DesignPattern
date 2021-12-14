public class Client {
    //發送賬單的數量，這個值是從數據庫中獲得
    private static int MAX_COUNT = 6;
    public static void main(String[] args) {
        //模擬發送郵件
        int i = 0;
        //把模板定義出來，這個是從數據中獲得
        Mail mail = new Mail(new AdvTemplate());
        mail.setTail("XX銀行版權所有");
        while (i < MAX_COUNT) {
            //以下是每封郵件不同的地方
            Mail cloneMail = mail.clone();
            cloneMail.setAppellation(getRandString(5) + " 先生（女士）");
            cloneMail.setReceiver(getRandString(5) + "@" + getRandString(8) + "."
            //然後發送郵件
                sendMail(cloneMail); i++;
        }
    }
}