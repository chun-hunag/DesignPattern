
public interface IVisitor {
    //首先，定義我可以訪問普通員工
    public void visit(CommonEmployee commonEmployee);
    //其次，定義我還可以訪問部門經理
    public void visit(Manager manager);
}