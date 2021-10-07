package com.seregsagapitov.springbootstore.entities;


import javax.persistence.*;

import java.util.List;

import static javax.persistence.GenerationType.IDENTITY;

@Entity
@Table(name = "products")
public class ProductHib {

    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name = "id_product")
    private  Long id;

    @Column(name = "title")
    private String name;


    @Column(name = "cost")
    private int cost;

    @ManyToMany
    @JoinTable(
            name = "clients_products",
            joinColumns = @JoinColumn(name = "product_id"),
            inverseJoinColumns = @JoinColumn(name = "client_id")
    )
    private List<ClientHib> ClientHib;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "ProductHib{" + "id=" + id + ", name='" + name + '\'' + ", cost=" + cost +
                '}';
    }
}
