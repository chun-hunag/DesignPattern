
public class Context {
    //定義狀態
    public final static State STATE1 = new ConcreteState1();
    public final static State STATE2 = new ConcreteState2();
    //當前狀態
    private State CurrentState;
    //獲得當前狀態
    public State getCurrentState() {
        return CurrentState;
    }
    //設置當前狀態
    public void setCurrentState(State currentState) {
        this.CurrentState = currentState;
        //切換狀態
        this.CurrentState.setContext(this);
    }
    //行為委托
    public void handle1() {
        this.CurrentState.handle1();
    }
    public void handle2() {
        this.CurrentState.handle2();
    }
}