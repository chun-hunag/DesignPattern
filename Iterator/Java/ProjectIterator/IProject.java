
public interface IProject {
    //增加項目
    public void add(String name, int num, int cost);
    //從老闆這里看到的就是項目信息
    public String getProjectInfo();
    //獲得一個可以被遍歷的對象
    public IProjectIterator iterator();
}