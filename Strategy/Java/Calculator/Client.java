
public class Client {
    //加符號
    public final static String ADD_SYMBOL = "+";
    //減符號
    public final static String SUB_SYMBOL = "-";
    public static void main(String[] args) {
        //輸入的兩個參數是數字
        int a = Integer.parseInt(args[0]);
        String symbol = args[1]; //符號
        int b = Integer.parseInt(args[2]);
        System.out.println("輸入的參數為：" + Arrays.toString(args));
        //上下文
        Context context = null;
        //判斷初始化哪一個策略
        if (symbol.equals(ADD_SYMBOL)) {
            context = new Context(new Add());
        } else if (symbol.equals(SUB_SYMBOL)) {
            context = new Context(new Sub());
        }
        System.out.println("運行結果為：" + a + symbol + b + "=" + context.exec(a, b, symbol));
    }
}