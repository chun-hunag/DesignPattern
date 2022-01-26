
public class Facade {
    //被委托的對象
    private ClassA a = new ClassA();
    private ClassB b = new ClassB();
    private ClassC c = new ClassC();
    //提供給外部訪問的方法
    public void methodA() {
        this.a.doSomethingA();
    }
    public void methodB() {
        this.b.doSomethingB();
    }
    public void methodC() {
        this.c.doSomethingC();
    }
}