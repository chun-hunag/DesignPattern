
public class Client {
    public static void main(String[] args) {
        //然後再定義一個代練者
        IGamePlayer proxy = new GamePlayerProxy("張三");
        //開始打游戲，記下時間戳
        System.out.println("開始時間是：2009-8-25 10:45");
        proxy.login("zhangSan", "password");
        //開始殺怪
        proxy.killBoss();
        //升級
        proxy.upgrade();
        //記錄結束游戲時間
        System.out.println("結束時間是：2009-8-26 03:40");
    }
}