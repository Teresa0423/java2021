package fju.com.cust;

public class Tester {
    public static void main(String[] args) {
        Customer customer = new Customer("0001", 500);
        System.out.println(customer.id + "\t" + customer.amount + "\t" + customer.getTotal());

        SileCustomer Maty = new SileCustomer("0011",5000);
        System.out.println(Maty.id + "\t" + Maty.amount + "\t" + Maty.getTotal());
    }
}

