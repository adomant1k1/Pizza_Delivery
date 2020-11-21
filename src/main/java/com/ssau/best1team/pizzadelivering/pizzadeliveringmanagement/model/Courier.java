package com.ssau.best1team.pizzadelivering.pizzadeliveringmanagement.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table
public class Courier {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private long id;

    @Column(name = "full_name", length = 50)
    private String fullName;

    @Column(name = "identity_number", length = 50)
    private String identityNumber;

    @Column(name = "driver_license", length = 3)
    private String driverLicense;

    @Column(length = 13)
    private String telephone;

    @OneToMany(mappedBy = "courier")
    private List<OrderDelivery> orderDeliveryList;

    public Courier() {
    }

    public long getId() {
        return id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getIdentityNumber() {
        return identityNumber;
    }

    public void setIdentityNumber(String identityNumber) {
        this.identityNumber = identityNumber;
    }

    public String getDriverLicense() {
        return driverLicense;
    }

    public void setDriverLicense(String driverLicense) {
        this.driverLicense = driverLicense;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public List<OrderDelivery> getOrderDeliveryList() {
        return orderDeliveryList;
    }

    public void setOrderDeliveryList(List<OrderDelivery> orderDeliveryList) {
        this.orderDeliveryList = orderDeliveryList;
    }
}