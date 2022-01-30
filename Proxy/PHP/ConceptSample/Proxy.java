
public class Proxy implements Subject {
    //要代理哪個實現類
    private Subject subject = null;
    //默認被代理者
    public Proxy() {
        this.subject = new Proxy();
    }
    //通過構造函數傳遞代理者
    public Proxy(Object...objects) {}
    //實現介面中定義的方法
    public void request() {
        this.before();
        this.subject.request();
        this.after();
    }
    //預處理
    private void before() {
        //do something
    }
    //善後處理
    private void after() {
        //do something
    }
}