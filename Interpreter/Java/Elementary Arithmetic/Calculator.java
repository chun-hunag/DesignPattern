
public class Calculator {
    //定義表達式
    private Expression expression;
    //構造函數傳參，並解析
    public Calculator(String expStr) {
        //定義一個棧，安排運算的先後順序
        Stack < Expression > stack = new Stack < Expression > ();
        //表達式拆分為字元數組
        char[] charArray = expStr.toCharArray();
        //運算
        Expression left = null;
        Expression right = null;
        for (int i = 0; i < charArray.length; i++) {
            switch (charArray[i]) {
                case '+': //加法
                    //加法結果放到棧中
                    left = stack.pop();
                    right = new VarExpression(String.valueOf(charArray[++i]));
                    stack.push(new AddExpression(left, right));
                    break;
                case '-':
                    left = stack.pop();
                    right = new VarExpression(String.valueOf(charArray[++i]));
                    stack.push(new SubExpression(left, right));
                    break;
                default: //公式中的變量
                    stack.push(new VarExpression(String.valueOf(charArray[i])));
            }
        }
        //把運算結果拋出來
        this.expression = stack.pop();
    }
    //開始運算
    public int run(HashMap < String, Integer >
        var) {
        return this.expression.interpreter(var);
    }
}