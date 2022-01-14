public class OuterUserOfficeInfo implements IOuterUserOfficeInfo {
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