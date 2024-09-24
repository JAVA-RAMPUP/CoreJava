package Abstraction;



//
//Abstract class
//  - show only relevant data and hide unnecessary details of an object from the user.
//        - cannot  create objects of abstract class - create objects of subclasses that extends the abstract class.
//



abstract class Payment {
    public double amount;

    public Payment(double amount) {
        this.amount = amount;
    }

    public abstract void makePayment();

    public void paymentDetails() {
        System.out.println("Payment amount: $" + amount);
    }
}

class GPay extends Payment {

    public String phoneNumber;

    public GPay(double amount, String phoneNumber) {
        super(amount);
        this.phoneNumber = phoneNumber;
    }

    @Override
    public void makePayment() {
        System.out.println("Making payment of $" + amount + " using Google Pay to " + phoneNumber);
    }

}


class NetBanking extends Payment {
    public String bankName;

    public NetBanking(double amount, String bankName) {
        super(amount);
        this.bankName = bankName;
    }

    @Override
    public void makePayment() {
        System.out.println("Making payment of $" + amount + " using Net Banking from " + bankName);
    }
}


class Cash extends Payment {
    public Cash(double amount) {
        super(amount);
    }

    @Override
    public void makePayment() {
        System.out.println("Making payment of $" + amount + " using Cash");
    }
}





public class Main {

    public static void main(String[] args) {
        Payment GPay = new GPay(100.0, "1234567890");
        Payment netBanking = new NetBanking(200.0, "Bank of Example");
        Payment cash = new Cash(50.0);

        GPay.paymentDetails();
        GPay.makePayment();

        cash.paymentDetails();
        cash.makePayment();

        netBanking.paymentDetails();
        netBanking.makePayment();



    }


}
