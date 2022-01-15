
public class CopyCatCorporation extends Corporation {
    //產什麼產品，不知道，等被調用的才知道
    public CopyCatCorporation(Product product) {
        super(product);
    }
    //狂賺錢
    public void makeMoney() {
        super.makeMoney();
        System.out.println("我賺錢呀...");
    }
}