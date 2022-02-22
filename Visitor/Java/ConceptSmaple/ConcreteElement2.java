
public class ConcreteElement2 extends Element {
    //完善業務邏輯
    public void doSomething() {
        //業務處理
    }
    //允許那個訪問者訪問
    public void accept(IVisitor visitor) {
        visitor.visit(this);
    }
}