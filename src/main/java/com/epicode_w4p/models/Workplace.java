package com.epicode_w4p.models;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.Data;


@Entity
@Table(name = "workplaces")
@Data
public class Workplace {
    @Id
    @SequenceGenerator(name = "workplaces_id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "workplaces_id")
    long workplace_id;
    String description;
    public enum type {PRIVATE,OPENSPACE,MEETING_ROOM} ; 
    @Enumerated(EnumType.STRING)
    type type;
    int max_capacity;
    @ManyToOne
    Office office;
}
