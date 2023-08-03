package com.example.demo.Address;

import com.example.demo.Employee.Employee;

import jakarta.persistence.*;

@Entity
@Table(name = "Address")

public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "addr_id")
    private Long id;
    @Column(name = "city")
    private String city;
    @Column(name = "status")
    private String status;
    // @OneToOne(mappedBy = "address")
    // private Employee employee;
    public Address() {
    }   
    public Address(Long id, String city, String status) {
        this.id = id;
        this.city = city;
        this.status = status;
    }
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getCity() {
        return city;
    }
    public void setCity(String city) {
        this.city = city;
    }
    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }
    @Override
    public String toString() {
        return "Address [id=" + id + ", city=" + city + ", status=" + status + "]";
    }
}