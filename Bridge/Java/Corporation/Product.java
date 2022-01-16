
public abstract class Product {
    //甭管是什麼產品它總要能被生產出來
    public abstract void beProducted();
    //生產出來的東西，一定要銷售出去，否則虧本
    public abstract void beSelled();
}