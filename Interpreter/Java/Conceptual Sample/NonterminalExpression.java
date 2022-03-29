
public class NonterminalExpression extends Expression {
    //每個非終結符表達式都會對其他表達式產生依賴
    public NonterminalExpression(Expression...expression) {}
    public Object interpreter(Context ctx) {
        //進行文法處理
        return null;
    }
}
