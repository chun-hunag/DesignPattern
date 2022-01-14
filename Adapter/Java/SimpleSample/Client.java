public class Client {
    public static void main(String[] args) {
        //原有的業務邏輯
        Target target = new ConcreteTarget();
        target.request();
        //現在增加了適配器角色後的業務邏輯
        Target target2 = new Adapter();
        target2.request();
    }
}