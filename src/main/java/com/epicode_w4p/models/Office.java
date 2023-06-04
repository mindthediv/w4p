package com.epicode_w4p.models;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "offices")
@Data
public class Office {
    @Id
    @SequenceGenerator(name = "offices_id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "offices_id")
    long office_id;
    String city;
    @Column(unique = true)
    String address;
    String name = this.getCity() + " office at" + this.getAddress();
    @OneToMany(mappedBy = "workplace_id")
    List<Workplace> workplaces;
}
