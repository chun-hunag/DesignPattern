
public class ClosingState extends LiftState {
    //電梯門關閉，這是關閉狀態要實現的動作
    @Override
    public void close() {
        System.out.println("電梯門關閉...");
    }
    //電梯門關了再打開
    @Override
    public void open() {
        super.context.setLiftState(Context.openingState); //置為敞門狀態
        super.context.getLiftState().open();
    }
    //電梯門關了就運行，這是再正常不過了
    @Override
    public void run() {
        super.context.setLiftState(Context.runningState); //設置為運行狀態
        super.context.getLiftState().run();
    }
    //電梯門關著，我就不按樓層
    @Override
    public void stop() {
        super.context.setLiftState(Context.stoppingState); //設置為停止狀態
        super.context.getLiftState().stop();
    }
}