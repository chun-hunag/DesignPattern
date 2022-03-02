
public class ConcreteColleague2 extends Colleague {
    //通過構造函數傳遞中介者
    public ConcreteColleague2(Mediator _mediator) {
        super(_mediator);
    }
    //自有方法 self-method
    public void selfMethod2() {
        //處理自己的業務邏輯
    }
    //依賴方法 dep-method
    public void depMethod2() {
        //處理自己的業務邏輯
        //自己不能處理的業務邏輯，委托給中介者處理
        super.mediator.doSomething2();
    }
}