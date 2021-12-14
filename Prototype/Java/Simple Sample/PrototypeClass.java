public class PrototypeClass implements Cloneable {
    //覆寫父類Object方法
    @Override
    public PrototypeClass clone() {
        PrototypeClass prototypeClass = null;
        try {
            prototypeClass = (PrototypeClass) super.clone();
        } catch (CloneNotSupportedException e) {
            //異常處理
        }
        return prototypeClass;
    }
}