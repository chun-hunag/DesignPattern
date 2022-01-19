
public class ConcreteDecorator2 extends Decorator {
    //定義被修飾者
    public ConcreteDecorator2(Component _component) {
        super(_component);
    }
    //定義自己的修飾方法
    private void method2() {
        System.out.println("method2修飾");
    }
    //重寫父類的Operation方法
    public void operate() {
        super.operate();
        this.method2();
    }
}