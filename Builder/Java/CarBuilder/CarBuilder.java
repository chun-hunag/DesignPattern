public abstract class CarBuilder {
    //建造一個模型，你要給我一個順序要求，就是組裝順序
    public abstract void setSequence(ArrayList < String > sequence);
    //設置完畢順序後，就可以直接拿到這個車輛模型
    public abstract CarModel getCarModel();
}