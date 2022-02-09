
public abstract class Subject {
    //定義一個觀察者數組
    private Vector < Observer > obsVector = new Vector < Observer > ();
    //增加一個觀察者
    public void addObserver(Observer o) {
        this.obsVector.add(o);
    }
    //刪除一個觀察者
    public void delObserver(Observer o) {
        this.obsVector.remove(o);
    }
    //通知所有觀察者
    public void notifyObservers() {
        for (Observer o: this.obsVector) {
            o.update();
        }
    }
}