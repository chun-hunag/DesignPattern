
public class Client {
    public static void main(String[] args) {
        for (Employee emp: mockEmployee()) {
            emp.accept(new Visitor());
        }
    }
    //模擬出公司的人員情況，我們可以想象這個數據是通過持久層傳遞過來的
    public static List < Employee > mockEmployee() {
        List < Employee > empList = new ArrayList < Employee > ();
        //產生張三這個員工
        CommonEmployee zhangSan = new CommonEmployee();
        zhangSan.setJob("編寫Java程式，絕對的藍領、苦工加搬運工");
        zhangSan.setName("張三");
        zhangSan.setSalary(1800);
        zhangSan.setSex(Employee.MALE);
        empList.add(zhangSan);
        //產生李四這個員工
        CommonEmployee liSi = new CommonEmployee();
        liSi.setJob("頁面美工，審美素質太不流行了！");
        liSi.setName("李四");
        liSi.setSalary(1900);
        liSi.setSex(Employee.FEMALE);
        empList.add(liSi);
        //再產生一個經理
        Manager wangWu = new Manager();
        wangWu.setName("王五");
        wangWu.setPerformance("基本上是負值，但是我會拍馬屁呀");
        wangWu.setSalary(18750);
        wangWu.setSex(Employee.MALE);
        empList.add(wangWu);
        return empList;
    }
}