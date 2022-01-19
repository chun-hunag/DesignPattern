
public abstract class Decorator extends Component {
    private Component component = null;
    //通過構造函數傳遞被修飾者
    public Decorator(Component _component) {
        this.component = _component;
    }
    //委托給被修飾者執行
    @Override
    public void operate() {
        this.component.operate();
    }
}