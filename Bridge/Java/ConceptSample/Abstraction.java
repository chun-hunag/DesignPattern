
public abstract class Abstraction {
    //定義對實現化角色的引用
    private Implementor imp;
    //約束子類必須實現該構造函數
    public Abstraction(Implementor _imp) {
        this.imp = _imp;
    }
    //自身的行為和屬性
    public void request() {
        this.imp.doSomething();
    }
    //獲得實現化角色
    public Implementor getImp() {
        return imp;
    }
}