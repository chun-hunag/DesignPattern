
public class SortDecorator extends Decorator {
    //構造函數
    public SortDecorator(SchoolReport sr) {
        super(sr);
    }
    //告訴老爸學校的排名情況
    private void reportSort() {
        System.out.println("我是排名第38名...");
    }
    //老爸看完成績單後再告訴他，加強作用
    @Override
    public void report() {
        super.report();
        this.reportSort();
    }
}