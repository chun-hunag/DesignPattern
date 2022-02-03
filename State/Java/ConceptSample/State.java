
public abstract class State {
    //定義一個環境角色，提供子類訪問
    protected Context context;
    //設置環境角色
    public void setContext(Context _context) {
        this.context = _context;
    }
    //行為1
    public abstract void handle1();
    //行為2
    public abstract void handle2();
}