public class Creator1 extends AbstractCreator {
    //只生產產品等級為1的A產品
    public AbstractProductA createProductA() {
        return new ProductA1();
    }
    //只生產產品等級為1的B產品
    public AbstractProductB createProductB() {
        return new ProductB1();
    }
}