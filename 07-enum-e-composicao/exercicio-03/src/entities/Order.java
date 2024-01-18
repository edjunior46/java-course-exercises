package entities;

import java.time.Instant;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class Order {
    
    private Instant moment;
    private OrderEnum status;
    private Customer customer;

    ArrayList<OrderItem> orderItems = new ArrayList<>();

    public Order() {
        this.moment = Instant.now();
        this.status = OrderEnum.PENDING;
    }

    public Order(Customer customer) {
        this.moment = Instant.now();
        this.status = OrderEnum.PENDING;
        this.customer = customer;
    }

    public Instant getMoment() {
        return moment;
    }

    public OrderEnum getStatus() {
        return status;
    }

    public void setStatus(OrderEnum status) {
        this.status = status;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public ArrayList<OrderItem> getOrderItems() {
        return orderItems;
    }

    public void addOrderItem(OrderItem orderItem) {
        orderItems.add(orderItem);
    }

    public void removeOrderItem(OrderItem orderItem) {
        orderItems.remove(orderItem);
    }

    public double subTotalOrderItems() {
        double result = 0.0;
        for (OrderItem orderItem : orderItems) {
            result += orderItem.subTotalOrderItem();
        }
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ORDER SUMMARY" + "\n");
        sb.append("Order moment: " + moment.atZone(ZoneId.systemDefault()).toLocalDateTime().format(DateTimeFormatter.ofPattern("MM/dd/yyyy HH:mm")) + "\n");
        sb.append("Order Status: " + status + "\n");
        sb.append("Customer: " + "\n");
        sb.append(getCustomer() + "\n");
        sb.append("Order Items: " + "\n");
        for (OrderItem orderItem : orderItems) {
            sb.append(orderItem + "\n");
        }
        sb.append("Total: $" + String.format("%.2f", subTotalOrderItems()));
        return sb.toString();
    }



}
