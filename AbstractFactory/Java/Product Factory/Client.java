public class Client {
    public static void main(String[] args) {
        //定義出兩個工廠
        AbstractCreator creator1 = new Creator1();
        AbstractCreator creator2 = new Creator2();
        //產生A1對象
        AbstractProductA a1 = creator1.createProductA();
        //產生A2對象
        AbstractProductA a2 = creator2.createProductA();
        //產生B1對象
        AbstractProductB b1 = creator1.createProductB();
        //產生B2對象
        AbstractProductB b2 = creator2.createProductB();
        /*
         * do something
         */
    }
}