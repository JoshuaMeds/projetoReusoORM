package com.example.locatehub.model;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity
@DiscriminatorValue("AUTOMOVEL")
public class Automovel extends Item {
    // AINDA PRECISA DOS ATRIBUTOS ESPECIFICOS
    public Automovel() { super(); }
}