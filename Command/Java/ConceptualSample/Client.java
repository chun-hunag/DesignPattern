
public class Client {
    public static void main(String[] args) {
        //首先聲明調用者Invoker
        Invoker invoker = new Invoker();
        //定義接收者
        Receiver receiver = new ConcreteReciver1();
        //定義一個發送給接收者的命令
        Command command = new ConcreteCommand1(receiver);
        //把命令交給調用者去執行
        invoker.setCommand(command);
        invoker.action();
    }
}