
public class OpeningState extends LiftState {
    //開啟當然可以關閉了，我就想測試一下電梯門開關功能
    @Override
    public void close() {
        //狀態修改
        super.context.setLiftState(Context.closingState);
        //動作委托為CloseState來執行
        super.context.getLiftState().close();
    }
    //打開電梯門
    @Override
    public void open() {
        System.out.println("電梯門開啟...");
    }
    //門開著時電梯就運行跑，這電梯，嚇死你！
    @Override
    public void run() {
        //do nothing;
    }
    //開門還不停止？
    public void stop() {
        //do nothing;
    }
}