package com.cakeshop.org.model;


import javax.persistence.*;

@Entity
@Table(name = "cake_info")
public class AddProducts {
    @Id
    @Column(name = "cake_id")
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int id;

    @Column(name = "cake_name")
    private String cakeName;

    @Column(name = "price_kg")
    private String price;

     private int quantity;
     @Column(name = "egg_less")
     private boolean eggLess;

     @Column(name = "cake_image")
     private String cakeImage;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCakeName() {
        return cakeName;
    }

    public void setCakeName(String cakeName) {
        this.cakeName = cakeName;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int  quantity) {
        this.quantity = quantity;
    }

    public boolean isEggLess() {
        return eggLess;
    }

    public void setEggLess(boolean eggLess) {
        this.eggLess = eggLess;
    }

    public String getCakeImage() {
        return cakeImage;
    }

    public void setCakeImage(String cakeImage) {
        this.cakeImage = cakeImage;
    }


}
