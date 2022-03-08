
public class Client {
    public static void main(String[] args) {
        //定義出發起人
        Originator originator = new Originator();
        //定義出備忘錄管理員
        Caretaker caretaker = new Caretaker();
        //創建一個備忘錄
        caretaker.setMemento(originator.createMemento());
        //恢復一個備忘錄
        originator.restoreMemento(caretaker.getMemento());
    }
}