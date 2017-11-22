/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sbs;

/**
 *
 * @author PC2
 */
public class DeliveryMan {

    private String id;
    private String name;
    private String phoneNo;
    private String email;
    private String status;

    public DeliveryMan() {
    }

    public DeliveryMan(String id, String name, String phoneNo, String email, String status) {
        this.id = id;
        this.name = name;
        this.phoneNo = phoneNo;
        this.email = email;
        this.status = status;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "DeliveryMan{" + "id=" + id + ", name=" + name + ", phoneNo=" + phoneNo + ", email=" + email + ", status=" + status + '}';
    }
}
