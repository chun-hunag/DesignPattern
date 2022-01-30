
public interface IGamePlayer {
    //登錄游戲
    public void login(String user, String password);
    //殺怪，網路游戲的主要特色
    public void killBoss();
    //升級
    public void upgrade();
}