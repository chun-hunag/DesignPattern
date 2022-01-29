
public abstract class Corp {
    //公司每個人都有名稱
    private String name = "";
    //公司每個人都職位
    private String position = "";
    //公司每個人都有薪水
    private int salary = 0;
    public Corp(String _name, String _position, int _salary) {
        this.name = _name;
        this.position = _position;
        this.salary = _salary;
    }
    //獲得員工信息
    public String getInfo() {
        String info = "";
        info = "姓名：" + this.name;
        info = info + "\t職位：" + this.position;
        info = info + "\t薪水：" + this.salary;
        return info;
    }
}