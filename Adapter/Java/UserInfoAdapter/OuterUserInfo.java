public class OuterUserInfo extends OuterUser implements IUserInfo {
    private Map baseInfo = super.getUserBaseInfo(); //員工的基本信息
    private Map homeInfo = super.getUserHomeInfo(); //員工的家庭信息
    private Map officeInfo = super.getUserOfficeInfo(); //工作信息
    /*
     * 家庭地址
     */
    public String getHomeAddress() {
        String homeAddress = (String) this.homeInfo.get("homeAddress");
        System.out.println(homeAddress);
        return homeAddress;
    }
    /*
     * 家庭電話號碼
     */
    public String getHomeTelNumber() {
        String homeTelNumber = (String) this.homeInfo.get("homeTelNumber");
        System.out.println(homeTelNumber);
        return homeTelNumber;
    }
    /*
     *職位信息
     */
    public String getJobPosition() {
        String jobPosition = (String) this.officeInfo.get("jobPosition");
        System.out.println(jobPosition);
        return jobPosition;
    }
    /*
     * 手機號碼
     */
    public String getMobileNumber() {
        String mobileNumber = (String) this.baseInfo.get("mobileNumber");
        System.out.println(mobileNumber);
        return mobileNumber;
    }
    /*
     * 辦公電話
     */
    public String getOfficeTelNumber() {
        String officeTelNumber = (String) this.officeInfo.get("officeTelNumber");
        System.out.println(officeTelNumber);
        return officeTelNumber;
    }
    /*
     * 員工的名稱
     */
    public String getUserName() {
        String userName = (String) this.baseInfo.get("userName");
        System.out.println(userName);
        return userName;
    }
}