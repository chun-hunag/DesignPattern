
public abstract class House extends Product {
    //豆腐渣就豆腐渣唄，好歹也是房子
    public void beProducted() {
        System.out.println("生產出的房子是這樣的...");
    }
    //雖然是豆腐渣，也是能夠銷售出去的
    public void beSelled() {
        System.out.println("生產出的房子賣出去了...");
    }
}