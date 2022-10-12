public class App {
    public static void main(String[] args) throws Exception {
        CustomerManager customerManager = new CustomerManager();
        // Strategy Design Pattern
        customerManager.databaseManager = new MySqlDatabaseManager();

        customerManager.getCustomers();
    }
}
