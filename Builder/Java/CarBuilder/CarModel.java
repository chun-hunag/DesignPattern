public abstract class CarModel {
    //這個參數是各個基本方法執行的順序
    private ArrayList < String > sequence = new ArrayList < String > ();
    //模型是啟動開始跑了
    protected abstract void start();
    //能發動，還要能停下來，那才是真本事
    protected abstract void stop();
    //喇叭會出聲音，是滴滴叫，還是嗶嗶叫
    protected abstract void alarm();
    //引擎會轟隆隆地響，不響那是假的
    protected abstract void engineBoom();
    //那模型應該會跑吧，別管是人推的，還是電力驅動，總之要會跑
    final public void run() {
        //循環一邊，誰在前，就先執行誰
        for (int i = 0; i < this.sequence.size(); i++) {
            String actionName = this.sequence.get(i);
            if (actionName.equalsIgnoreCase("start")) {
                this.start(); //啟動汽車
            } else if (actionName.equalsIgnoreCase("stop")) {
                this.stop(); //停止汽車
            } else if (actionName.equalsIgnoreCase("alarm")) {
                this.alarm(); //喇叭開始叫了
            } else if (actionName.equalsIgnoreCase("engine boom")) {
                //如果是engine boom關鍵this.engineBoom(); //引擎開始轟鳴
            }
        }
    }
    //把傳遞過來的值傳遞到類內
    final public void setSequence(ArrayList sequence) {
        this.sequence = sequence;
    }
}