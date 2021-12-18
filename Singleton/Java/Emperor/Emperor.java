public class Emperor {
    private static final Emperor emperor = new Emperor(); //初始化一個皇帝
    private Emperor() {
        //世俗和道德約束你，目的就是不希望產生第二個皇帝
    }
    public static Emperor getInstance() {
        return emperor;
    }
    //皇帝發話了
    public static void say() {
        System.out.println("我就是皇帝某某某....");
    }
}