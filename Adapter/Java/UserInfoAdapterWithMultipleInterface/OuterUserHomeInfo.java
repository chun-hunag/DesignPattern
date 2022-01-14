public class OuterUserHomeInfo implements IOuterUserHomeInfo {
    /*
     * 員工的家庭信息
     */
    public Map getUserHomeInfo() {
        HashMap homeInfo = new HashMap();
        homeInfo.put("homeTelNumbner", "員工的家庭電話是...");
        homeInfo.put("homeAddress", "員工的家庭地址是...");
        return homeInfo;
    }
}