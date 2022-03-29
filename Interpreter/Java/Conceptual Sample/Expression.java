
public abstract class Expression {
    //每個表達式必須有一個解析任務
    public abstract Object interpreter(Context ctx);
}