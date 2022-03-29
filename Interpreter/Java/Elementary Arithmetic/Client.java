
public class Client {

    //運行四則運算
    public static void main(String[] args) throws IOException {
        String expStr = getExpStr();
        //賦值
        HashMap < String, Integer >
            var = getValue(expStr);
        Calculator cal = new Calculator(expStr);
        System.out.println("運算結果為：" + expStr + "=" + cal.run(var));
    }

    //獲得表達式
    public static String getExpStr() throws IOException {
        System.out.print("請輸入表達式：");
        return (new BufferedReader(new InputStreamReader(System.in))).readLine();
    }

    //獲得值映射
    public static HashMap < String, Integer > getValue(String exprStr) throws IOException {
        HashMap < String, Integer > map = new HashMap < String, Integer > ();
        //解析有幾個參數要傳遞
        for (char ch: exprStr.toCharArray()) {
            if (ch != '+' && ch != '-') {
                //解決重復參數的問題
                if (!map.containsKey(String.valueOf(ch))) {
                        String in = (new BufferedReader(new InputStreamReader(System.map.put(String.valueOf(ch), Integer.valueOf( in ));
                }
            }
        }

        return map;
    }
}
