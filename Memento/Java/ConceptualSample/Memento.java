
public class Memento {
    //發起人的內部狀態
    private String state = "";
    //構造函數傳遞參數
    public Memento(String _state) {
        this.state = _state;
    }
    public String getState() {
        return state;
    }
    public void setState(String state) {
        this.state = state;
    }
}