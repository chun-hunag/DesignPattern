
public class Visitor implements IVisitor {

    //訪問普通員工，列印出報表
    public void visit(CommonEmployee commonEmployee) {
        System.out.println(this.getCommonEmployee(commonEmployee));
    }

    //訪問部門經理，列印出報表
    public void visit(Manager manager) {
        System.out.println(this.getManagerInfo(manager));
    }

    //組裝出基本信息
    private String getBasicInfo(Employee employee) {
        String info = "姓名：" + employee.getName() + "\t";
        info = info + "性別：" + employee.getSex() == Employee.FEMALE ? "女" : "男"
        info = info + "薪水： " + employee.getSalary() + "\t ";
            return info;
    }

    //組裝出部門經理的信息
    private String getManagerInfo(Manager manager) {
        String basicInfo = this.getBasicInfo(manager);
        String otherInfo = "業績：" + manager.getPerformance() + "\t";
        return basicInfo + otherInfo;
    }

    //組裝出普通員工信息
    private String getCommonEmployee(CommonEmployee commonEmployee) {
        String basicInfo = this.getBasicInfo(commonEmployee);
        String otherInfo = "工作：" + commonEmployee.getJob() + "\t";
        return basicInfo + otherInfo;
    }
}