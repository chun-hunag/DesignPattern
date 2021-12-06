public abstract class Creator {
    /*
     * 創建一個產品對象，其輸入參數類型可以自行設置
     * 通常為String、Enum、Class等，當然也可以為空
     */
    public abstract < T extends Product > T createProduct(Class < T > c);
}