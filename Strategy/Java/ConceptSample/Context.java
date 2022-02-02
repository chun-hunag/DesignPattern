
public class Context {
    //抽象策略
    private Strategy strategy = null;
    //構造函數設置具體策略
    public Context(Strategy _strategy) {
        this.strategy = _strategy;
    }
    //封裝後的策略方法
    public void doAnything() {
        this.strategy.doSomething();
    }
}