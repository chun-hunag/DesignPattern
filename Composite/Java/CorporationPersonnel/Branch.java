
public class Branch extends Corp {
    //領導下邊有哪些下級領導和小兵
    ArrayList < Corp > subordinateList = new ArrayList < Corp > ();
    //構造函數是必需的
    public Branch(String _name, String _position, int _salary) {
        super(_name, _position, _salary);
    }
    //增加一個下屬，可能是小頭目，也可能是個小兵
    public void addSubordinate(Corp corp) {
        this.subordinateList.add(corp);
    }
    //我有哪些下屬
    public ArrayList < Corp > getSubordinate() {
        return this.subordinateList;
    }
}