
public abstract class AbstractClass {
    //基本方法
    protected abstract void doSomething();
    //基本方法
    protected abstract void doAnything();
    //模板方法
    public void templateMethod() {
        /*
         * 調用基本方法，完成相關的邏輯
         */
        this.doAnything();
        this.doSomething();
    }
}