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
public class Pending {
    private String CustomerName, RestaurantName, DeliveryMan, State, Time;

    public Pending(String CustomerName,String DeliveryMan, String RestaurantName,String State,String Time)
    {
        this.CustomerName = CustomerName;
        this.DeliveryMan = DeliveryMan;
        this.RestaurantName = RestaurantName;
        this.State = State;
        this.Time = Time;
    }

    public String getCustomerName() {
        return CustomerName;
    }

    public void setCustomerName(String CustomerName) {
        this.CustomerName = CustomerName;
    }

    public String getRestaurantName() {
        return RestaurantName;
    }

    public void setRestaurantName(String RestaurantName) {
        this.RestaurantName = RestaurantName;
    }

    public String getDeliveryMan() {
        return DeliveryMan;
    }

    public void setDeliveryMan(String DeliveryMan) {
        this.DeliveryMan = DeliveryMan;
    }

    public String getState() {
        return State;
    }

    public void setState(String State) {
        this.State = State;
    }

    public String getTime() {
        return Time;
    }

    public void setTime(String Time) {
        this.Time = Time;
    }
    
    
}
