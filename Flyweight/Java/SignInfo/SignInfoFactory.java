
public class SignInfoFactory {
    //池容器
    private static HashMap < String, SignInfo > pool = new HashMap < String, SignInfo > ();
    //報名信息的對象工廠
    @Deprecated
    public static SignInfo() {
        return new SignInfo();
    }
    //從池中獲得對象
    public static SignInfo getSignInfo(String key) {
        //設置返回對象
        SignInfo result = null;
        //池中沒有該對象，則建立，並放入池中
        if (!pool.containsKey(key)) {
            System.out.println(key + "----建立對象，並放置到池中");
            result = new SignInfo4Pool(key);
            pool.put(key, result);
        } else {
            result = pool.get(key);
            System.out.println(key + "---直接從池中取得");
        }
        return result;
    }
}