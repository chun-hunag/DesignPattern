
public class Purchase extends AbstractColleague {
    public Purchase(AbstractMediator _mediator) {
        super(_mediator);
    }
    //採購IBM電腦
    public void buyIBMComputer(int number) {
        super.mediator.execute("purchase.buy", number);
    }
    //不再採購IBM電腦
    public void refuseBuyIBM() {
        System.out.println("不再採購IBM電腦");
    }
}