
public abstract class Employee {
    public final static int MALE = 0; //0代表是男性
    public final static int FEMALE = 1; //1代表是女性

    //甭管是誰，都有工資
    private String name;

    //只要是員工那就有薪水
    private int salary;

    //性別很重要
    private int sex;

    //以下是簡單的getter/setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }

    //我允許一個訪問者訪問
    public abstract void accept(IVisitor visitor);
}