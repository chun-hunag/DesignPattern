
public class ConcreteCommand1 extends Command {
    //對哪個Receiver類進行命令處理
    private Receiver receiver;
    //構造函數傳遞接收者
    public ConcreteCommand1(Receiver _receiver) {
        this.receiver = _receiver;
    }
    //必須實現一個命令
    public void execute() {
        //業務處理
        this.receiver.doSomething();
    }
}