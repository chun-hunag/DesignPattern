
public abstract class Flyweight {
    //內部狀態
    private String intrinsic;
    //外部狀態
    protected final String Extrinsic;
    //要求享元角色必須接受外部狀態
    public Flyweight(String _Extrinsic) {
        this.Extrinsic = _Extrinsic;
    }
    //定義業務操作
    public abstract void operate();
    //內部狀態的getter/setter
    public String getIntrinsic() {
        return intrinsic;
    }
    public void setIntrinsic(String intrinsic) {
        this.intrinsic = intrinsic;
    }
}