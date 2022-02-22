
public abstract class Element {
    //定義業務邏輯
    public abstract void doSomething();
    //允許誰來訪問
    public abstract void accept(IVisitor visitor);
}