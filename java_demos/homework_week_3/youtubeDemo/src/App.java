public class App {
    public static void main(String[] args) throws Exception {
        CreditManager creditManager = new CreditManager();
        creditManager.calculate();
        creditManager.save();

        Customer customer = new Customer();
        customer.setId(1);
        customer.setCity("Çorum");

        Customer customer2 = new Customer(2, "Ankara");

        // IoC Container ile çözülecek
        CustomerManager customerManager = new CustomerManager(customer, new MilitaryCreditManager());
        customerManager.save();
        customerManager.giveCredit();

        Company company = new Company();
        company.setTaxNumber("100000");
        company.setCompanyName("Şirket İsmi");
        company.setId(100);

        CustomerManager customerManager2 = new CustomerManager(customer2, new TeacherCreditManager());

        Customer c1 = new Customer();
        Customer c2 = new Person();
        Customer c3 = new Company();
    }
}

class CreditManager {
    public void calculate() {
        System.out.println("Hesaplandı.");
    }

    public void save() {
        System.out.println("Kredi verildi.");
    }
}

interface ICreditManager {
    void calculate();

    void save();
}

abstract class BaseCreditManager implements ICreditManager {

    @Override
    public abstract void calculate();

    @Override
    public void save() {
        System.out.println("Kaydedildi.");

    }

}

class TeacherCreditManager extends BaseCreditManager {

    @Override
    public void calculate() {
        System.out.println("Öğretmen kredisi hesaplandı.");

    }

    @Override
    public void save() {

        super.save();
        System.out.println("Override save method çalıştı.");
    }

}

class MilitaryCreditManager extends BaseCreditManager {

    @Override
    public void calculate() {
        System.out.println("Asker kredisi hesaplandı.");

    }

}

class Person extends Customer {
    private String nationalIdentity;
    private String firstName;
    private String lastName;

    public Person() {

    }

    public Person(String nationalIdentity) {
        super();
        this.nationalIdentity = nationalIdentity;
    }

    public String getNationalIdentity() {
        return this.nationalIdentity;
    }

    public void setNationalIdentity(String nationalIdentity) {
        this.nationalIdentity = nationalIdentity;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}

class Customer {
    private int id;
    private String city;

    public Customer() {

    }

    public Customer(int id, String city) {
        this.id = id;
        this.city = city;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

}

class CustomerManager {

    private Customer customer;
    private ICreditManager creditManager;

    public CustomerManager(Customer customer, ICreditManager creditManager) {
        this.customer = customer;
        this.creditManager = creditManager;
    }

    public void save() {
        System.out.println(this.customer.getId() + " kaydedildi.");
    }

    public void giveCredit() {
        this.creditManager.calculate();
        System.out.println("Kredi verildi.");
    }
}

class Company extends Customer {
    private String taxNumber;
    private String companyName;

    public String getTaxNumber() {
        return this.taxNumber;
    }

    public void setTaxNumber(String taxNumber) {
        this.taxNumber = taxNumber;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

}
