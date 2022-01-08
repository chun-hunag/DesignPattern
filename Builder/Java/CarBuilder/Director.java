public class Director {
    private ArrayList < String > sequence = new ArrayList();
    private BenzBuilder benzBuilder = new BenzBuilder();
    private BMWBuilder bmwBuilder = new BMWBuilder();
    /*
     * A類型的奔馳車模型，先start，然後stop，其他什麼引擎、喇叭一概沒有
     */
    public BenzModel getABenzModel() {
        //清理場景，這里是一些初級程式員不註意的地方
        this.sequence.clear();
        //ABenzModel的執行順序
        this.sequence.add("start");
        this.sequence.add("stop");
        //按照順序返回一個奔馳車
        this.benzBuilder.setSequence(this.sequence);
        return (BenzModel) this.benzBuilder.getCarModel();
    }
    /*
     * B型號的奔馳車模型，是先發動引擎，然後啟動，然後停止，沒有喇叭
     */
    public BenzModel getBBenzModel() {
        this.sequence.clear();
        this.sequence.add("engine boom");
        this.sequence.add("start");
        this.sequence.add("stop");
        this.benzBuilder.setSequence(this.sequence);
        return (BenzModel) this.benzBuilder.getCarModel();
    }
    /*
     * C型號的寶馬車是先按下喇叭（炫耀嘛），然後啟動，然後停止
     */
    public BMWModel getCBMWModel() {
        this.sequence.clear();
        this.sequence.add("alarm");
        this.sequence.add("start");
        this.sequence.add("stop");
        this.bmwBuilder.setSequence(this.sequence);
        return (BMWModel) this.bmwBuilder.getCarModel();
    }
    /*
     * D類型的寶馬車只有一個功能，就是跑，啟動起來就跑，永遠不停止
     */
    public BMWModel getDBMWModel() {
        this.sequence.clear();
        this.sequence.add("start");
        this.bmwBuilder.setSequence(this.sequence);
        return (BMWModel) this.benzBuilder.getCarModel();
    }
    /*
     * 這里還可以有很多方法，你可以先停止，然後再啟動，或者一直停著不動，靜態的嘛
     * 導演類嘛，按照什麼順序是導演說了算
     */
}