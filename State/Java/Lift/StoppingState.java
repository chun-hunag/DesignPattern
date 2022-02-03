
public class StoppingState extends LiftState {
    //停止狀態關門？電梯門本來就是關著的！
    @Override
    public void close() {
        //do nothing;
    }
    //停止狀態，開門，那是要的！
    @Override
    public void open() {
        super.context.setLiftState(Context.openingState);
        super.context.getLiftState().open();
    }
    //停止狀態再運行起來，正常得很
    @Override
    public void run() {
        super.context.setLiftState(Context.runningState);
        super.context.getLiftState().run();
    }
    //停止狀態是怎麼發生的呢？當然是停止方法執行了
    @Override
    public void stop() {
        System.out.println("電梯停止了...");
    }
}