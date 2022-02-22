
public class ObjectStructure {
    //對象生成器，這里通過一個工廠方法模式模擬
    public static Element createElement() {
        Random rand = new Random();
        if (rand.nextInt(100) > 50) {
            return new ConcreteElement1();
        } else {
            return new ConcreteElement2();
        }
    }
}