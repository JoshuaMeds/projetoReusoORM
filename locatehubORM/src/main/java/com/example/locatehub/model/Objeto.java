package com.example.locatehub.model;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity
@DiscriminatorValue("OBJETO")
public class Objeto extends Item {
    // AINDA PRECISA DOS ATRIBUTOS ESPECIFICOS
    public Objeto() { super(); }
}