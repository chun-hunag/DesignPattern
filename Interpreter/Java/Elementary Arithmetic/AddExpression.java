
public class AddExpression extends SymbolExpression {
    public AddExpression(Expression _left, Expression _right) {
        super(_left, _right);
    }
    //把左右兩個表達式運算的結果加起來
    public int interpreter(HashMap < String, Integer > var) {
        return super.left.interpreter(var) + super.right.interpreter(var);
    }
}