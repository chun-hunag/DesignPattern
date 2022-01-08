public class BMWModel extends CarModel {
    protected void alarm() {
        System.out.println("寶馬車的喇叭聲音是這個樣子的...");
    }
    protected void engineBoom() {
        System.out.println("寶馬車的引擎是這個聲音的...");
    }
    protected void start() {
        System.out.println("寶馬車跑起來是這個樣子的...");
    }
    protected void stop() {
        System.out.println("寶馬車應該這樣停車...");
    }
}