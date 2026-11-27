package org.example;

public class OrderService {

    private PaymentService paymentService;

//    public OrderService(PaymentService paymentService) {
//        this.paymentService = paymentService;
//    }

    public void setPaymentService(PaymentService paymentService) {
        this.paymentService = paymentService;
    }


//    public OrderService(){
//        System.out.println("Start The Container");
//    }

    public void placedOrder(){
        paymentService.pay();
        System.out.println("Order-Placed");
    }
}
