
public abstract class Expression {
    //解析公式和數值，其中var中的key值是公式中的參數，value值是具體的數字
    public abstract int interpreter(HashMap < String, Integer > var);
}