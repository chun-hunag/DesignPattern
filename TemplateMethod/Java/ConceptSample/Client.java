
public class Client {
    public static void main(String[] args) {
        AbstractClass class1 = new ConcreteClass1();
        AbstractClass class2 = new ConcreteClass2();
        //調用模板方法
        class1.templateMethod();
        class2.templateMethod();
    }
}