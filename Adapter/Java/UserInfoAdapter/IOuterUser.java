public interface IOuterUser {
    //基本信息，比如名稱、性別、手機號碼等
    public Map getUserBaseInfo();
    //工作區域信息
    public Map getUserOfficeInfo();
    //用戶的家庭信息
    public Map getUserHomeInfo();
}