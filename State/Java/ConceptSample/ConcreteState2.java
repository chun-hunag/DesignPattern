
public class ConcreteState2 extends State {
    @Override
    public void handle1() {
        //設置當前狀態為state1
        super.context.setCurrentState(Context.STATE1);
        //過渡到state1狀態，由Context實現
        super.context.handle1();
    }
    @Override
    public void handle2() {
        //本狀態下必須處理的邏輯
    }
}