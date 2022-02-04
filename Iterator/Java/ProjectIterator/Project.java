
public class Project implements IProject {
    //定義一個項目列表，說有的項目都放在這里
    private ArrayList < IProject > projectList = new ArrayList < IProject > ();
    //項目名稱
    private String name = "";
    //項目成員數量
    private int num = 0;
    //項目費用
    private int cost = 0;
    public Project() {}
    //定義一個構造函數，把所有老闆需要看到的信息存儲起來
    private Project(String name, int num, int cost) {
        //賦值到類的成員變量中
        this.name = name;
        this.num = num;
        this.cost = cost;
    }
    //增加項目
    public void add(String name, int num, int cost) {
        this.projectList.add(new Project(name, num, cost));
    }
    //得到項目的信息
    public String getProjectInfo() {
        String info = "";
        //獲得項目的名稱
        info = info + "項目名稱是：" + this.name;
        //獲得項目人數
        info = info + "\t項目人數: " + this.num;
        //項目費用
        info = info + "\t 項目費用：" + this.cost;
        return info;
    }
    //產生一個遍歷對象
    public IProjectIterator iterator() {
        return new ProjectIterator(this.projectList);
    }
}