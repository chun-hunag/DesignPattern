public class Minister {
    public static void main(String[] args) {
        for (int day = 0; day < 3; day++) {
            Emperor emperor = Emperor.getInstance();
            emperor.say();
        }
        //三天見的皇帝都是同一個人，榮幸吧！
    }
}