public class OuterUserBaseInfo implements IOuterUserBaseInfo {
    /*
     * 用戶的基本信息
     */
    public Map getUserBaseInfo() {
        HashMap baseInfoMap = new HashMap();
        baseInfoMap.put("userName", "這個員工叫混世魔王...");
        baseInfoMap.put("mobileNumber", "這個員工電話是...");
        return baseInfoMap;
    }
}