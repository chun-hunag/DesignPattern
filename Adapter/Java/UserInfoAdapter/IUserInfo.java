public interface IUserInfo {
    //獲得用戶姓名
    public String getUserName();
    //獲得家庭地址
    public String getHomeAddress();
    //手機號碼，這個太重要，手機泛濫呀
    public String getMobileNumber();
    //辦公電話，一般是座機
    public String getOfficeTelNumber();
    //這個人的職位是什麼
    public String getJobPosition();
    //獲得家庭電話，這有點不好，我不喜歡打家庭電話討論工作
    public String getHomeTelNumber();
}