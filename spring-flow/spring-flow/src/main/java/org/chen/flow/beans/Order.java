package org.chen.flow.beans;

import org.chen.flow.beans.org.chen.flow.beans.Customer;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Order  implements Serializable{
    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public static final long serialVersionUID = 1L;

    private Customer customer;

    private List<Pizza> pizzas;

    private Payment payment;

    public Payment getPayment() {
        return payment;
    }

    public void setPayment(Payment payment) {
        this.payment = payment;
    }

    public Order() {
        System.out.println("create the Order");
        pizzas = new ArrayList<Pizza>();
        customer = new Customer();
    }

    public Customer getCustomer() {
        return customer;
    }

    public List<Pizza> getPizzas() {
        return pizzas;
    }

    public void setPizzas(List<Pizza> pizzas) {
        this.pizzas = pizzas;
    }

    public void addPiazza(Pizza pizza){
        this.pizzas.add(pizza);
    }

    public float getTotal(){
        return 0.0f;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public void saveOrder(){
        System.out.print(this.serialVersionUID);
    }
}
