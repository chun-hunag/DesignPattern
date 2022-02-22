
public class Client {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            //獲得元素對象
            Element el = ObjectStructure.createElement();
            //接受訪問者訪問
            el.accept(new Visitor());
        }
    }
}