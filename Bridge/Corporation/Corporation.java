
public abstract class Corporation {
    //定義一個抽象的產品對象，不知道具體是什麼產品
    private Product product;
    //構造函數，由子類定義傳遞具體的產品進來
    public Corporation(Product product) {
        this.product = product;
    }
    //公司是乾什麼的？賺錢的！
    public void makeMoney() {
        //每家公司都是一樣，先生產
        this.product.beProducted();
        //然後銷售
        this.product.beSelled();
    }
}