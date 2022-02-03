
public abstract class LiftState {
    //定義一個環境角色，也就是封裝狀態的變化引起的功能變化
    protected Context context;
    public void setContext(Context _context) {
        this.context = _context;
    }
    //首先電梯門開啟動作
    public abstract void open();
    //電梯門有開啟，那當然也就有關閉了
    public abstract void close();
    //電梯要能上能下，運行起來
    public abstract void run();
    //電梯還要能停下來
    public abstract void stop();
}