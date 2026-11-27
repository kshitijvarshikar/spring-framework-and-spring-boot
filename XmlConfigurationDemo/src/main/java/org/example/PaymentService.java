package org.example;

public class PaymentService {

    String type;
    int count;

    public PaymentService(String type, int count) {
        this.type = type;
        this.count = count;
    }


    //    public PaymentService() {
//        System.out.println("Start the payment Container");
//    }

    public void pay(){
        System.out.println("String Type is : " + type + " Count is : " + count);
        System.out.println("Payment-Done");
    }
}
