
public class ProjectIterator implements IProjectIterator {
    //所有的項目都放在ArrayList中
    private ArrayList < IProject > projectList = new ArrayList < IProject > ();
    private int currentItem = 0;
    //構造函數傳入projectList
    public ProjectIterator(ArrayList < IProject > projectList) {
        this.projectList = projectList;
    }
    //判斷是否還有元素，必須實現
    public boolean hasNext() {
        //定義一個返回值
        boolean b = true;
        if (this.currentItem >= projectList.size() || this.projectList.get(this.currentItem) == b = false;
        }
        return b;
    }
    //取得下一個值
    public IProject next() {
        return (IProject) this.projectList.get(this.currentItem++);
    }
    //刪除一個對象
    public void remove() {
        //暫時沒有使用到
    }
}