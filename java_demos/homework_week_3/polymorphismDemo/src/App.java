public class App {
    public static void main(String[] args) throws Exception {
        BaseLogger[] loggers = new BaseLogger[] { new EmailLogger(), new FileLogger(), new DatabaseLogger() };
        for (BaseLogger logger : loggers) {
            logger.log("Log message");
        }

        CustomerManager customerManager = new CustomerManager(new DatabaseLogger());
        customerManager.add();
    }
}
