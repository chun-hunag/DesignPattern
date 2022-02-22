
public class Visitor implements IVisitor {
    //訪問el1元素
    public void visit(ConcreteElement1 el1) {
        el1.doSomething();
    }
    //訪問el2元素
    public void visit(ConcreteElement2 el2) {
        el2.doSomething();
    }
}