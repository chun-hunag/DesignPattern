
public interface IVisitor {
    //可以訪問哪些對象
    public void visit(ConcreteElement1 el1);
    public void visit(ConcreteElement2 el2);
}