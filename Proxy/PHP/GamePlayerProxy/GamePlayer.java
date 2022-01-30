
public class GamePlayer implements IGamePlayer {
    private String name = "";
    //構造函數限制誰能創建對象，並同時傳遞姓名
    public GamePlayer(IGamePlayer _gamePlayer, String _name) throws Exception {
        if (_gamePlayer == null) {
            throw new Exception("不能創建真實角色！");
        } else {
            this.name = _name;
        }
    }
    //打怪，最期望的就是殺老怪
    public void killBoss() {
        System.out.println(this.name + "在打怪！");
    }
    //進游戲之前你肯定要登錄吧，這是一個必要條件
    public void login(String user, String password) {
        System.out.println("登錄名為" + user + "的用戶" + this.name + "登錄成功！");
    }
    //升級，升級有很多方法，花錢買是一種，做任務也是一種
    public void upgrade() {
        System.out.println(this.name + " 又升了一級！");
    }
}