
public interface Iterator {
    //遍歷到下一個元素
    public Object next();
    //是否已經遍歷到尾部
    public boolean hasNext();
    //刪除當前指向的元素
    public boolean remove();
}