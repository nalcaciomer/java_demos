public class App {
    public static void main(String[] args) {
        Product product1 = new Product();
        product1.setName("Delonghi Kahve Makinesi");
        product1.setDiscount(7);
        product1.setUnitPrice(7500);
        product1.setUnitsInStock(3);
        product1.setImageUrl("Delonghi.jpg");

        Product product2 = new Product();
        product2.setName("Smeg Kahve Makinesi");
        product2.setDiscount(7);
        product2.setUnitPrice(7500);
        product2.setUnitsInStock(3);
        product2.setImageUrl("Smeg.jpg");

        Product product3 = new Product();
        product3.setName("Kitchen Aid Kahve Makinesi");
        product3.setDiscount(7);
        product3.setUnitPrice(7500);
        product3.setUnitsInStock(3);
        product3.setImageUrl("Kitchen Aid.jpg");

        Product[] products = { product1, product2, product3 };

        for (Product product : products) {
            System.out.println(product.getName());
        }

        IndividualCustomer individualCustomer = new IndividualCustomer();
        individualCustomer.setId(1);
        individualCustomer.setPhone("05222222222");
        individualCustomer.setCustomerNumber("12345");
        individualCustomer.setFirstName("Ömer");
        individualCustomer.setLastName("Nalçacı");

        CorporateCustomer corporateCustomer = new CorporateCustomer();
        corporateCustomer.setId(2);
        corporateCustomer.setPhone("05333333333");
        corporateCustomer.setCustomerNumber("54321");
        corporateCustomer.setCompanyName("Kodlamaio");
        corporateCustomer.setTaxNumber("0123456789");

        Customer[] customers = { individualCustomer, corporateCustomer };

        for (Customer customer : customers) {
            System.out.println(customer.getCustomerNumber());
        }
    }
}
