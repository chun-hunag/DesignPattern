
public class Client {

    public static void main(String[] args) {
        //首先是組裝一個組織結構出來
        Branch ceo = compositeCorpTree();
        //首先把CEO的信息列印出來
        System.out.println(ceo.getInfo());
        //然後是所有員工信息
        System.out.println(getTreeInfo(ceo));
    }

    //把整個樹組裝出來
    public static Branch compositeCorpTree() {
        //首先產生總經理CEO
        Branch root = new Branch("王大麻子", "總經理", 100000);
        //把三個部門經理產生出來
        Branch developDep = new Branch("劉大瘸子", "研發部門經理", 10000);
        Branch salesDep = new Branch("馬二拐子", "銷售部門經理", 20000);
        Branch financeDep = new Branch("趙三駝子", "財務部經理", 30000);
        //再把三個小組長產生出來
        Branch firstDevGroup = new Branch("楊三乜斜", "開發一組組長", 5000);
        Branch secondDevGroup = new Branch("吳大棒槌", "開發二組組長", 6000);
        //把所有的小兵都產生出來
        Leaf a = new Leaf("a", "開發人員", 2000);
        Leaf b = new Leaf("b", "開發人員", 2000);
        Leaf c = new Leaf("c", "開發人員", 2000);
        Leaf d = new Leaf("d", "開發人員", 2000);
        Leaf e = new Leaf("e", "開發人員", 2000);
        Leaf f = new Leaf("f", "開發人員", 2000);
        Leaf g = new Leaf("g", "開發人員", 2000);
        Leaf h = new Leaf("h", "銷售人員", 5000);
        Leaf i = new Leaf("i", "銷售人員", 4000);
        Leaf j = new Leaf("j", "財務人員", 5000);
        Leaf k = new Leaf("k", "CEO秘書", 8000);
        Leaf zhengLaoLiu = new Leaf("鄭老六", "研發部副經理", 20000);
        //開始組裝
        //CEO下有三個部門經理和一個秘書
        root.addSubordinate(k);
        root.addSubordinate(developDep);
        root.addSubordinate(salesDep);
        root.addSubordinate(financeDep);
        //研發部經理
        developDep.addSubordinate(zhengLaoLiu);
        developDep.addSubordinate(firstDevGroup);
        developDep.addSubordinate(secondDevGroup);
        //看看兩個開發小組下有什麼
        firstDevGroup.addSubordinate(a);
        firstDevGroup.addSubordinate(b);
        firstDevGroup.addSubordinate(c);
        secondDevGroup.addSubordinate(d);
        secondDevGroup.addSubordinate(e);
        secondDevGroup.addSubordinate(f);
        //再看銷售部下的人員情況
        salesDep.addSubordinate(h);
        salesDep.addSubordinate(i);
        //最後一個財務
        financeDep.addSubordinate(j);
        return root;
    }

    //遍歷整棵樹,只要給我根節點，我就能遍歷出所有的節點
    public static String getTreeInfo(Branch root) {
        ArrayList < Corp > subordinateList = root.getSubordinate();
        String info = "";
        for (Corp s: subordinateList) {
            if (s instanceof Leaf) { //是員工就直接獲得信息
                info = info + s.getInfo() + "\n";
            } else { //是個小頭目
                info = info + s.getInfo() + "\n" + getTreeInfo((Branch) s);
            }
        }
        return info;
    }
}