package jum.air.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="hotel", schema ="rabiot",catalog="")
public class Hotel {
    private Integer id;
    private  String clientId;
    private float price;
    private Date fromDay;
    private Date endDay;
    private String picture;
    private String address;
    private String kindOf;
    private String name;
    private String coupon;

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy=GenerationType.AUTO)
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Basic
    @Column(name="client_id")
    public String getClientId() {
        return clientId;
    }

    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    @Basic
    @Column(name="price")
    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    @Basic
    @Column(name="fromday")
    public Date getFromDay() {
        return fromDay;
    }

    public void setFromDay(Date formDay) {
        this.fromDay = formDay;
    }

    @Basic
    @Column(name="endday")
    public Date getEndDay() {
        return endDay;
    }

    public void setEndDay(Date endDay) {
        this.endDay = endDay;
    }

    @Basic
    @Column(name="picture")
    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    @Basic
    @Column(name="address")
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Basic
    @Column(name="kindOf")
    public String getKindOf() {
        return kindOf;
    }

    public void setKindOf(String kindOf) {
        this.kindOf = kindOf;
    }

    @Basic
    @Column(name="name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name="coupon")
    public String getCoupon() {
        return coupon;
    }

    public void setCoupon(String coupon) {
        this.coupon = coupon;
    }

}
