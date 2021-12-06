public class Creator2 extends AbstractCreator {
    //只生產產品等級為2的A產品
    public AbstractProductA createProductA() {
        return new ProductA2();
    }
    //只生產產品等級為2的B產品
    public AbstractProductB createProductB() {
        return new ProductB2();
    }
}