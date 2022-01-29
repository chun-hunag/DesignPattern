
public class Client {
    public static void main(String[] args) {
        //創建一個根節點
        Composite root = new Composite();
        root.doSomething();
        //創建一個樹枝構件
        Composite branch = new Composite();
        //創建一個葉子節點
        Leaf leaf = new Leaf();
        //建立整體
        root.add(branch);
        branch.add(leaf);
    }
    //通過遞歸遍歷樹
    public static void display(Composite root) {
        for (Component c: root.getChildren()) {
            if (c instanceof Leaf) { //葉子節點
                c.doSomething();
            } else { //樹枝節點
                display((Composite) c);
            }
        }
    }
}