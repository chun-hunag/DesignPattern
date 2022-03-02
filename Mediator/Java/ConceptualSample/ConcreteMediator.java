
public class ConcreteMediator extends Mediator {

    @Override
    public void doSomething1() {
        //調用同事類的方法，只要是public方法都可以調用
        super.c1.selfMethod1();
        super.c2.selfMethod2();
    }

    public void doSomething2() {
        super.c1.selfMethod1();
        super.c2.selfMethod2();
    }
}