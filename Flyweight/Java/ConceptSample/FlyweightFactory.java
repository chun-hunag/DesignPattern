
public class FlyweightFactory {
    //定義一個池容器
    private static HashMap < String, Flyweight > pool = new HashMap < String, Flyweight > ();
    //享元工廠
    public static Flyweight getFlyweight(String Extrinsic) {
        //需要返回的對象
        Flyweight flyweight = null;
        //在池中沒有該對象
        if (pool.containsKey(Extrinsic)) {
            flyweight = pool.get(Extrinsic);
        } else {
            //根據外部狀態創建享元對象
            flyweight = new ConcreteFlyweight1(Extrinsic);
            //放置到池中
            pool.put(Extrinsic, flyweight);
        }
        return flyweight;
    }
}