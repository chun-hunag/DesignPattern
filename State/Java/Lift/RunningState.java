
public class RunningState extends LiftState {
    //電梯門關閉？這是肯定的
    @Override
    public void close() {
        //do nothing
    }
    //運行的時候開電梯門？你瘋了！電梯不會給你開的
    @Override
    public void open() {
        //do nothing
    }
    //這是在運行狀態下要實現的方法
    @Override
    public void run() {
        System.out.println("電梯上下運行...");
    }
    //這絕對是合理的，只運行不停止還有誰敢坐這個電梯？！估計只有上帝了
    @Override
    public void stop() {
        super.context.setLiftState(Context.stoppingState); //環境設置為停止狀態
        super.context.getLiftState().stop();
    }
}