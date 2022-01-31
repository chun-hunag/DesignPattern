
public class ConcreteFlyweight1 extends Flyweight {
    //接受外部狀態
    public ConcreteFlyweight1(String _Extrinsic) {
        super(_Extrinsic);
    }
    //根據外部狀態進行邏輯處理
    public void operate() {
        //業務邏輯
    }
}