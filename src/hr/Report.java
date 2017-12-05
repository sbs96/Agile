/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hr;

/**
 *
 * @author YUNNI
 */
public class Report {
    private String DaliveryMan, Customer,Restaurant,Distance,Time;

    public Report(String DaliveryMan, String Customer, String Restaurant, String Distance, String Time) {
        this.DaliveryMan = DaliveryMan;
        this.Customer = Customer;
        this.Restaurant = Restaurant;
        this.Distance = Distance;
        this.Time = Time;
    }

    public String getDaliveryMan() {
        return DaliveryMan;
    }

    public void setDaliveryMan(String DaliveryMan) {
        this.DaliveryMan = DaliveryMan;
    }

    public String getCustomer() {
        return Customer;
    }

    public void setCustomer(String Customer) {
        this.Customer = Customer;
    }

    public String getRestaurant() {
        return Restaurant;
    }

    public void setRestaurant(String Restaurant) {
        this.Restaurant = Restaurant;
    }

    public String getDistance() {
        return Distance;
    }

    public void setDistance(String Distance) {
        this.Distance = Distance;
    }

    public String getTime() {
        return Time;
    }

    public void setTime(String Time) {
        this.Time = Time;
    }
    
    
}
