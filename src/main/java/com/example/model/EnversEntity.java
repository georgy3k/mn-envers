package com.example.model;

import org.hibernate.envers.Audited;

import javax.persistence.*;

@Entity
@Audited
public class EnversEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
