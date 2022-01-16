
public class Client {
    public static void main(String[] args) {
        //定義一個實現化角色
        Implementor imp = new ConcreteImplementor1();
        //定義一個抽象化角色
        Abstraction abs = new RefinedAbstraction(imp);
        //執行行文
        abs.request();
    }
}