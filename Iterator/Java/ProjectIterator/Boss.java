
public class Boss {
    public static void main(String[] args) {
        //定義一個List，存放所有的項目對象
        IProject project = new Project();
        //增加星球大戰項目
        project.add("星球大戰項目ddddd", 10, 100000);
        //增加扭轉時空項目
        project.add("扭轉時空項目", 100, 10000000);
        //增加超人改造項目
        project.add("超人改造項目", 10000, 1000000000);
        //這邊100個項目
        for (int i = 4; i < 104; i++) {
            project.add("第" + i + "個項目", i * 5, i * 1000000);
        }
        //遍歷一下ArrayList，把所有的數據都取出
        IProjectIterator projectIterator = project.iterator();
        while (projectIterator.hasNext()) {
            IProject p = (IProject) projectIterator.next();
            System.out.println(p.getProjectInfo());
        }
    }
}