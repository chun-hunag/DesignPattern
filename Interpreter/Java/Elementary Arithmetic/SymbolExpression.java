
public abstract class SymbolExpression extends Expression {
    protected Expression left;
    protected Expression right;
    //所有的解析公式都應只關心自己左右兩個表達式的結果
    public SymbolExpression(Expression _left, Expression _right) {
        this.left = _left;
        this.right = _right;
    }
}