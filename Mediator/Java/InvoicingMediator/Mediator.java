
public class Mediator extends AbstractMediator {
    //中介者最重要的方法
    public void execute(String str, Object...objects) {
        if (str.equals("purchase.buy")) { //採購電腦
            this.buyComputer((Integer) objects[0]);
        } else if (str.equals("sale.sell")) { //銷售電腦
            this.sellComputer((Integer) objects[0]);
        } else if (str.equals("sale.offsell")) { //折價銷售
            this.offSell();
        } else if (str.equals("stock.clear")) { //清倉處理
            this.clearStock();
        }
    }
    //採購電腦
    private void buyComputer(int number) {
        int saleStatus = super.sale.getSaleStatus();
        if (saleStatus > 80) { //銷售情況良好
            System.out.println("採購IBM電腦:" + number + "台");
            super.stock.increase(number);
        } else { //銷售情況不好
            int buyNumber = number / 2; //折半採購
            System.out.println("採購IBM電腦：" + buyNumber + "台");
        }
    }
    //銷售電腦
    private void sellComputer(int number) {
        if (super.stock.getStockNumber() < number) { //庫存數量不夠銷售
            super.purchase.buyIBMcomputer(number);
        }
        super.stock.decrease(number);
    }
    //折價銷售電腦
    private void offSell() {
        System.out.println("折價銷售IBM電腦" + stock.getStockNumber() + "台");
    }
    //清倉處理
    private void clearStock() {
        //要求清倉銷售
        super.sale.offSale();
        //要求採購人員不要採購
        super.purchase.refuseBuyIBM();
    }
}