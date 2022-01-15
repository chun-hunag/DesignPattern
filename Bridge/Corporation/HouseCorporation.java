
public class HouseCorporation extends Corporation {
    //定義傳遞一個House產品進來
    public HouseCorp(House house) {
        super(house);
    }
    //房地產公司很High了，賺錢，計算利潤
    public void makeMoney() {
        super.makeMoney();
        System.out.println("房地產公司賺大錢了...");
    }
}