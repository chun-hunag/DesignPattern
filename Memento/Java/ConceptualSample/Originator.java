public class Originator {
    //內部狀態
    private String state = "";
    public String getState() {
        return state;
    }
    public void setState(String state) {
        this.state = state;
    }
    //創建一個備忘錄
    public Memento createMemento() {
        return new Memento(this.state);
    }
    //恢復一個備忘錄
    public void restoreMemento(Memento _memento) {
        this.setState(_memento.getState());
    }
}