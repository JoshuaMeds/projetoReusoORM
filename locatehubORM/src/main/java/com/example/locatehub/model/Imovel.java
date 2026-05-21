package com.example.locatehub.model;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity
@DiscriminatorValue("IMOVEL")
public class Imovel extends Item {
    // AINDA PRECISA DOS ATRIBUTOS ESPECIFICOS
    public Imovel() { super(); }
}