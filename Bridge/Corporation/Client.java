
public class Client {
    public static void main(String[] args) {
        House house = new House();
        System.out.println("-------房地產公司是這樣運行的-------");
        //先找到房地產公司
        HouseCorporation houseCorporation = new HouseCorporation(house);
        //看我怎麼掙錢
        houseCorporation.makeMoney();
        System.out.println("\n");
        //山寨公司生產的產品很多，不過我只要指定產品就成了
        System.out.println("-------山寨公司是這樣運行的-------");
        CopyCatCorporation CopyCatCorporation = new CopyCatCorporation(new IPod());
        CopyCatCorporation.makeMoney();
    }
}