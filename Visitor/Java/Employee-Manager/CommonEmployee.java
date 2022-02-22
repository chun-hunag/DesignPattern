
public class CommonEmployee extends Employee {
    //工作內容，這非常重要，以後的職業規劃就是靠它了
    private String job;
    public String getJob() {
        return job;
    }
    public void setJob(String job) {
        this.job = job;
    }
    //我允許訪問者訪問
    @Override
    public void accept(IVisitor visitor) {
        visitor.visit(this);
    }
}