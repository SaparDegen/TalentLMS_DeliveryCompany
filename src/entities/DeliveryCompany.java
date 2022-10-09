package entities;

import java.util.ArrayList;
import java.util.List;

public class DeliveryCompany {
    private String deliveryCompanyName;
    private final double pricePerKilogram = 400;
    private List<Customer> customers = new ArrayList<>();
    private final double maxCapacityPerCubeCentimeter = 300;

    public DeliveryCompany(String deliveryCompanyName, List<Customer> customers) {
        this.deliveryCompanyName = deliveryCompanyName;
        this.customers = customers;
    }

    public DeliveryCompany(String deliveryCompanyName) {
        this.deliveryCompanyName = deliveryCompanyName;
    }

    public String getDeliveryCompanyName() {
        return deliveryCompanyName;
    }

    public void setDeliveryCompanyName(String deliveryCompanyName) {
        this.deliveryCompanyName = deliveryCompanyName;
    }

    public double getPricePerKilogram() {
        return pricePerKilogram;
    }

    public List<Customer> getCustomers() {
        return customers;
    }

    public void setCustomers(List<Customer> customers) {
        this.customers = customers;
    }

    public double getMaxCapacityPerCubeCentimeter() {
        return maxCapacityPerCubeCentimeter;
    }

    @Override
    public String toString() {
        return "DeliveryCompany:\n" +
                "deliveryCompanyName = " + deliveryCompanyName + '\n' +
                "pricePerKilogram = " + pricePerKilogram + '\n' +
                "customers = " + customers +
                "maxCapacityPerCubeCentimeter = " + maxCapacityPerCubeCentimeter + '\n';
    }
}


