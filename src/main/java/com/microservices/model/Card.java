package com.microservices.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "card")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Card {

    @Id private Long id;
    private String name;
}
