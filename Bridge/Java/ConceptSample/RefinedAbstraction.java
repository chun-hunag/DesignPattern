
public class RefinedAbstraction extends Abstraction {
    //覆寫構造函數
    public RefinedAbstraction(Implementor _imp) {
        super(_imp);
    }
    //修正父類的行為
    @Override
    public void request() {
        /*
         * 業務處理...
         */
        super.request();
        super.getImp().doAnything();
    }
}