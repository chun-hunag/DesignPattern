public class OuterUser implements IOuterUser {
    /*
     * 用戶的基本信息
     */
    public Map getUserBaseInfo() {
        HashMap baseInfoMap = new HashMap();
        baseInfoMap.put("userName", "這個員工叫混世魔王...");
        baseInfoMap.put("mobileNumber", "這個員工電話是...");
        return baseInfoMap;
    }
    /*
     * 員工的家庭信息
     */
    public Map getUserHomeInfo() {
        HashMap homeInfo = new HashMap();
        homeInfo.put("homeTelNumbner", "員工的家庭電話是...");
        homeInfo.put("homeAddress", "員工的家庭地址是...");
        return homeInfo;
    }
    /*
     * 員工的工作信息，比如，職位等
     */
    public Map getUserOfficeInfo() {
        HashMap officeInfo = new HashMap();
        officeInfo.put("jobPosition", "這個人的職位是BOSS...");
        officeInfo.put("officeTelNumber", "員工的辦公電話是...");
        return officeInfo;
    }
}