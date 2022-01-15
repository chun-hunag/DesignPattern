
public class ClothesCorporation extends Corporation {
    //服裝公司生產的就是衣服了
    protected void produce() {
        System.out.println("服裝公司生產衣服...");
    }
    //服裝公司賣服裝，可只賣服裝，不賣穿衣服的模特
    protected void sell() {
        System.out.println("服裝公司出售衣服...");
    }
    //服裝公司不景氣，但怎麼說也是賺錢行業
    public void makeMoney() {
        super.makeMoney();
        System.out.println("服裝公司賺小錢...");
    }
}