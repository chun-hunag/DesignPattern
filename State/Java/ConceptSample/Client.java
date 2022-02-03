
public class Client {
    public static void main(String[] args) {
        //定義環境角色
        Context context = new Context();
        //初始化狀態
        context.setCurrentState(new ConcreteState1());
        //行為執行
        context.handle1();
        context.handle2();
    }
}