
public class Stock extends AbstractColleague {
    public Stock(AbstractMediator _mediator) {
        super(_mediator);
    }
    //剛開始有100台電腦
    private static int COMPUTER_NUMBER = 100;
    //庫存增加
    public void increase(int number) {
        COMPUTER_NUMBER = COMPUTER_NUMBER + number;
        System.out.println("庫存數量為：" + COMPUTER_NUMBER);
    }
    //庫存降低
    public void decrease(int number) {
        COMPUTER_NUMBER = COMPUTER_NUMBER - number;
        System.out.println("庫存數量為：" + COMPUTER_NUMBER);
    }
    //獲得庫存數量
    public int getStockNumber() {
        return COMPUTER_NUMBER;
    }
    //存貨壓力大了，就要通知採購人員不要採購，銷售人員要盡快銷售
    public void clearStock() {
        System.out.println("清理存貨數量為：" + COMPUTER_NUMBER);
        super.mediator.execute("stock.clear");
    }
}