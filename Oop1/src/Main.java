public class Main {
    public static void main(String[] args) {
        Product product1 = new Product();
        product1.setName("Delonghi Kahve Makinesi");
        product1.setUnitPrice(7500);
        product1.setDiscount(7);
        product1.setUnitsInStock(3);
        product1.setImageUrl("bilmemne.jpg");

        // System.out.println(product1.name);

        Product product2 = new Product(); // right click--source--format
        product2.setName("Smeg Kahve Makinesi");
        product2.setUnitPrice(6500);
        product2.setDiscount(8);
        product2.setUnitsInStock(4);
        product2.setImageUrl("bilmemne.jpg");

        Product product3 = new Product();
        product3.setName("Kitchen Aid Kahve Makinesi");
        product3.setUnitPrice(4500);
        product3.setDiscount(9);
        product3.setUnitsInStock(2);
        product3.setImageUrl("bilmemne.jpg");

        Product[] products = { product1, product2, product3 };

        for (Product product : products) {
            System.out.println(product.getName());
        }

        IndividualCustomer customer1 = new IndividualCustomer();
        customer1.setId(1);
        customer1.setPhoneNumber("1111111");
        customer1.setCustomerNumber("12345");
        customer1.setFirstName("Engin");
        customer1.setLastName("Demiroğ");

        CorparateCustomer customer2 = new CorparateCustomer();
        customer2.setId(2);
        customer2.setPhoneNumber("54155");
        customer2.setCustomerNumber("4845");
        customer2.setCompanyName("Kodlama.io");
        customer2.setTaxNumber("48815");

        Customer[] customers = { customer1, customer2 };
    }
}
