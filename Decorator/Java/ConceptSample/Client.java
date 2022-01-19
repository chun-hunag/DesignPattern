
public class Client {
    public static void main(String[] args) {
        Component component = new ConcreteComponent();
        //第一次修飾
        component = new ConcreteDecorator1(component);
        //第二次修飾
        component = new ConcreteDecorator2(component);
        //修飾後運行
        component.operate();
    }
}