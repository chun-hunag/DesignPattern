
public class Client {
    public static void main(String[] args) {
        //創建一個被觀察者
        ConcreteSubject subject = new ConcreteSubject();
        //定義一個觀察者
        Observer obs = new ConcreteObserver();
        //觀察者觀察被觀察者
        subject.addObserver(obs);
        //觀察者開始活動了
        subject.doSomething();
    }
}