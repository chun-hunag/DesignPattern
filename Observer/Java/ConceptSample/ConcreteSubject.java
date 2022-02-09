
public class ConcreteSubject extends Subject {
    //具體的業務
    public void doSomething() {
        /*
         * do something
         */
        super.notifyObservers();
    }
}