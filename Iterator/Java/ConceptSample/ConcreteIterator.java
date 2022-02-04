
public class ConcreteIterator implements Iterator {
    private Vector vector = new Vector();
    //定義當前游標
    public int cursor = 0;
    @SuppressWarnings("unchecked")
    public ConcreteIterator(Vector _vector) {
        this.vector = _vector;
    }
    //判斷是否到達尾部
    public boolean hasNext() {
        if (this.cursor == this.vector.size()) {
            return false;
        } else {
            return true;
        }
    }
    //返回下一個元素
    public Object next() {
        Object result = null;
        if (this.hasNext()) {
            result = this.vector.get(this.cursor++);
        } else {
            result = null;
        }
        return result;
    }
    //刪除當前元素
    public boolean remove() {
        this.vector.remove(this.cursor);
        return true;
    }
}