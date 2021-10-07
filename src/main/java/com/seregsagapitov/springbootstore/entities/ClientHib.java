package com.seregsagapitov.springbootstore.entities;


import javax.persistence.*;

import java.util.List;

import static javax.persistence.GenerationType.IDENTITY;

@Entity
@Table(name = "clients")
public class ClientHib {
    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name = "id_client")
    private Long id_client;

    @Column(name = "name")
    private String name;

    @ManyToMany
    @JoinTable(
            name = "clients_products",
            joinColumns = @JoinColumn(name = "client_id"),
            inverseJoinColumns = @JoinColumn(name = "product_id")
            )
            private List<ProductHib> productHib;

    public Long getId_client() {
        return id_client;
    }

    public void setId_client(Long id_client) {
        this.id_client = id_client;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "ClientHib{" + "id_client=" + id_client + ", name='" + name + '\'' + '}';
    }


}
