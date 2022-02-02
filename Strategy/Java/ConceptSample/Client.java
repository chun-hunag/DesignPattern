
public class Client {
    public static void main(String[] args) {
        //聲明一個具體的策略
        Strategy strategy = new ConcreteStrategy1();
        //聲明上下文對象
        Context context = new Context(strategy);
        //執行封裝後的方法
        context.doAnything();
    }
}