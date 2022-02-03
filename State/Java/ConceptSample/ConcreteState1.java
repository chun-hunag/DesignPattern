
public class ConcreteState1 extends State {
    @Override
    public void handle1() {
        //本狀態下必須處理的邏輯
    }
    @Override
    public void handle2() {
        //設置當前狀態為stat2
        super.context.setCurrentState(Context.STATE2);
        //過渡到state2狀態，由Context實現
        super.context.handle2();
    }
}