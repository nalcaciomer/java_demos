public class App {
    public static void main(String[] args) throws Exception {
        ProductManager productManager = new ProductManager();

        Product product = new Product();
        product.id = 1;
        product.name = "Mouse";
        product.price = 10;

        productManager.add(product);

        DatabaseHelper.Connection.createConnection();
    }
}
