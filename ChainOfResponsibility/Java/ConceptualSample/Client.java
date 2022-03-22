
public class Client {
    public static void main(String[] args) {
        //聲明所有的處理節點
        Handler handler1 = new ConcreteHandler1();
        Handler handler2 = new ConcreteHandler2();
        Handler handler3 = new ConcreteHandler3();
        //設置鏈中的階段順序1-->2-->3
        handler1.setNext(handler2);
        handler2.setNext(handler3);
        //提交請求，返回結果
        Response response = handler1.handlerMessage(new Request());
    }
}