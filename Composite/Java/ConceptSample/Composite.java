
public class Composite extends Component {
    //構件容器
    private ArrayList < Component > componentArrayList = new ArrayList < Component > ();
    //增加一個葉子構件或樹枝構件
    public void add(Component component) {
        this.componentArrayList.add(component);
    }
    //刪除一個葉子構件或樹枝構件
    public void remove(Component component) {
        this.componentArrayList.remove(component);
    }
    //獲得分支下的所有葉子構件和樹枝構件
    public ArrayList < Component > getChildren() {
        return this.componentArrayList;
    }
}