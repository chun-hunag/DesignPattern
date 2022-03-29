
public class Client {
    public static void main(String[] args) {
        Context ctx = new Context();
        //通常定一個語法容器，容納一個具體的表達式，通常為ListArray、LinkedList、Stack等類型
        Stack & Expression > stack = null;
        for (;;) {
            //進行語法判斷，並產生遞歸調用
        }
        //產生一個完整的語法樹，由各個具體的語法分析進行解析
        Expression exp = stack.pop();
        //具體元素進入場景
        exp.interpreter(ctx);
    }
}