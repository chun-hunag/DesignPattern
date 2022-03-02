
public class Sale extends AbstractColleague {
    public Sale(AbstractMediator _mediator) {
        super(_mediator);
    }
    //銷售IBM電腦
    public void sellIBMComputer(int number) {
        super.mediator.execute("sale.sell", number);
        System.out.println("銷售IBM電腦" + number + "台");
    }
    //反饋銷售情況，0～100變化，0代表根本就沒人買，100代表非常暢銷，出一個賣一個
    public int getSaleStatus() {
        Random rand = new Random(System.currentTimeMillis());
        int saleStatus = rand.nextInt(100);
        System.out.println("IBM電腦的銷售情況為：" + saleStatus);
        return saleStatus;
    }
    //折價處理
    public void offSale() {
        super.mediator.execute("sale.offsell");
    }
}