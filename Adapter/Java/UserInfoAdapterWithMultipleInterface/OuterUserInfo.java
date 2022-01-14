public class OuterUserInfo implements IUserInfo {
    //源目標對象
    private IOuterUserBaseInfo baseInfo = null; //員工的基本信息
    private IOuterUserHomeInfo homeInfo = null; //員工的家庭信息
    private IOuterUserOfficeInfo officeInfo = null; //工作信息
    //數據處理
    private Map baseMap = null;
    private Map homeMap = null;
    private Map officeMap = null;
    //構造函數傳遞對象
    public OuterUserInfo(IOuterUserBaseInfo _baseInfo, IOuterUserHomeInfo _homeInfo, this.baseInfo = _baseInfo; this.homeInfo = _homeInfo; this.officeInfo = _officeInfo;
        //數據處理
        this.baseMap = this.baseInfo.getUserBaseInfo(); this.homeMap = this.homeInfo.getUserHomeInfo(); this.officeMap = this.officeInfo.getUserOfficeInfo();
    }
    //家庭地址
    public String getHomeAddress() {
        String homeAddress = (String) this.homeMap.get("homeAddress");
        System.out.println(homeAddress);
        return homeAddress;
    }
    //家庭電話號碼
    public String getHomeTelNumber() {
        String homeTelNumber = (String) this.homeMap.get("homeTelNumber");
        System.out.println(homeTelNumber);
        return homeTelNumber;
    }
    //職位信息
    public String getJobPosition() {
        String jobPosition = (String) this.officeMap.get("jobPosition");
        System.out.println(jobPosition);
        return jobPosition;
    }
    //手機號碼
    public String getMobileNumber() {
        String mobileNumber = (String) this.baseMap.get("mobileNumber");
        System.out.println(mobileNumber);
        return mobileNumber;
    }
    //辦公電話
    public String getOfficeTelNumber() {
        String officeTelNumber = (String) this.officeMap.get("officeTelNumber");
        System.out.println(officeTelNumber);
        return officeTelNumber;
    }
    // 員工的名稱
    public String getUserName() {
        String userName = (String) this.baseMap.get("userName");
        System.out.println(userName);
        return userName;
    }
}