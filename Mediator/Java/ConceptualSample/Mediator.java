
public abstract class Mediator {
    //定義同事類
    protected ConcreteColleague1 c1;
    protected ConcreteColleague2 c2;

    //通過getter/setter方法把同事類註入進來
    public ConcreteColleague1 getC1() {
        return c1;
    }

    public void setC1(ConcreteColleague1 c1) {
        this.c1 = c1;
    }

    public ConcreteColleague2 getC2() {
        return c2;
    }

    public void setC2(ConcreteColleague2 c2) {
        this.c2 = c2;
    }
    //中介者模式的業務邏輯
    public abstract void doSomething1();
    public abstract void doSomething2();
}