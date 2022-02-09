
public class ConcreteObserver implements Observer {
    //實現更新方法
    public void update() {
        System.out.println("接收到信息，並進行處理！");
    }
}