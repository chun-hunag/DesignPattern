
public class ConcreteDecorator1 extends Decorator {
    //定義被修飾者
    public ConcreteDecorator1(Component _component) {
        super(_component);
    }
    //定義自己的修飾方法
    private void method1() {
        System.out.println("method1 修飾");
    }
    //重寫父類的Operation方法
    public void operate() {
        this.method1();
        super.operate();
    }
}