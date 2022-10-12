public class App {
    public static void main(String[] args) throws Exception {
        // CustomerDao customerDao = new OracleCustomerDao();

        CustomerManager customerManager = new CustomerManager(new MySqlCustomerDao());
        customerManager.add();
    }
}
