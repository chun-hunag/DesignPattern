
public class SubExpression extends SymbolExpression {

    public SubExpression(Expression _left, Expression _right) {
        super(_left, _right);
    }

    //左右兩個表達式相減
    public int interpreter(HashMap < String, Integer > var) {
        return super.left.interpreter(var) - super.right.interpreter(var);
    }
}