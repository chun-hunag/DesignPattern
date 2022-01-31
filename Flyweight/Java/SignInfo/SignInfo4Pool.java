
public class SignInfo4Pool extends SignInfo {
    //定義一個對象池提取的KEY值
    private String key;
    //構造函數獲得相同標志
    public SignInfo4Pool(String _key) {
        this.key = _key;
    }
    public String getKey() {
        return key;
    }
    public void setKey(String key) {
        this.key = key;
    }
}