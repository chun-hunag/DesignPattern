
public class Manager extends Employee {
    //這類人物的職責非常明確：業績
    private String performance;
    public String getPerformance() {
        return performance;
    }
    public void setPerformance(String performance) {
        this.performance = performance;
    }
    //部門經理允許訪問者訪問
    @Override
    public void accept(IVisitor visitor) {
        visitor.visit(this);
    }
}