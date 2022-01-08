public class Client {
    public static void main(String[] args) {
        //存放run的順序
        ArrayList < String > sequence = new ArrayList < String > ();
        sequence.add("engine boom"); //客戶要求，run的時候先發動引擎
        sequence.add("start"); //啟動起來
        sequence.add("stop"); //開了一段就停下來
        //要一個奔馳車：
        BenzBuilder benzBuilder = new BenzBuilder();
        //把順序給這個builder類，製造出這樣一個車出來
        benzBuilder.setSequence(sequence);
        //製造出一個奔馳車
        BenzModel benz = (BenzModel) benzBuilder.getCarModel();
        //奔馳車跑一下看看
        benz.run();
        //按照同樣的順序，我再要一個寶馬
        BMWBuilder bmwBuilder = new BMWBuilder();
        bmwBuilder.setSequence(sequence);
        BMWModel bmw = (BMWModel) bmwBuilder.getCarModel();
        bmw.run();
    }
}