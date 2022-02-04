
public class ConcreteAggregate implements Aggregate {
    //容納對象的容器
    private Vector vector = new Vector();
    //增加一個元素
    public void add(Object object) {
        this.vector.add(object);
    }
    //返回迭代器對象
    public Iterator iterator() {
        return new ConcreteIterator(this.vector);
    }
    //刪除一個元素
    public void remove(Object object) {
        this.remove(object);
    }
}