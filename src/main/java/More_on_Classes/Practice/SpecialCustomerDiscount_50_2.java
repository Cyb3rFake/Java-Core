package More_on_Classes.Practice;

public class SpecialCustomerDiscount_50_2 {
    public static void main(String[] args) {
        Purchase customer = new Purchase();
        Purchase specialCustomer = new Purchase() {
            //your code goes here
            @Override
            public int totalAmount(int prise) {         //переписываемый метод для объекта класса specialCustomer
                return prise - (prise * 20) / 100;
            }
        };


        System.out.println(customer.totalAmount(1000));
        System.out.println(specialCustomer.totalAmount(100000));
    }
}

class Purchase{
    int prise;
    public int totalAmount(int prise){
        return prise - (prise * 10) / 100;
    }

}
