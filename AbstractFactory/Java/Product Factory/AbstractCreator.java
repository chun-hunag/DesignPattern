// 有N個產品族，在抽象工廠類中就應該有N個創建方法。
public abstract class AbstractCreator {
    //創建A產品家族
    public abstract AbstractProductA createProductA();
    //創建B產品家族
    public abstract AbstractProductB createProductB();
}