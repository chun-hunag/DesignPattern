
public class Client {
    public static void main(String[] args) {
        AbstractMediator mediator = new Mediator();
        //採購人員採購電腦
        System.out.println("------採購人員採購電腦--------");
        Purchase purchase = new Purchase(mediator);
        purchase.buyIBMComputer(100);
        //銷售人員銷售電腦
        System.out.println("\n------銷售人員銷售電腦--------");
        Sale sale = new Sale(mediator);
        sale.sellIBMComputer(1);
        //庫房管理人員管理庫存
        System.out.println("\n------庫房管理人員清庫處理--------");
        Stock stock = new Stock(mediator);
        stock.clearStock();
    }
}