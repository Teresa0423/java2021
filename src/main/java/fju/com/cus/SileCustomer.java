package fju.com.cus;

public class SileCustomer extends Customer{
    float discount = 0.1f;

    public SileCustomer(String id,int amount){
        super(id, amount);
    }

    @Override
    public int getTotal() {
        return amount - (int)(amount*discount);
    }
}
