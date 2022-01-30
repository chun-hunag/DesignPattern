
public class GamePlayerProxy implements IGamePlayer {
    private IGamePlayer gamePlayer = null;
    //通過構造函數傳遞要對誰進行代練
    public GamePlayerProxy(String name) {
        try {
            gamePlayer = new GamePlayer(this, name);
        } catch (Exception e) {
            // TODO 異常處理
        }
    }
    //代練殺怪
    public void killBoss() {
        this.gamePlayer.killBoss();
    }
    //代練登錄
    public void login(String user, String password) {
        this.gamePlayer.login(user, password);
    }
    //代練升級
    public void upgrade() {
        this.gamePlayer.upgrade();
    }
}