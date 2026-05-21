package com.example.locatehub.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Setter
@Getter
@Entity
@Table(name = "tb_item")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE) // Estratégia de tabela única
@DiscriminatorColumn(name = "tipo_item", discriminatorType = DiscriminatorType.STRING)
public abstract class Item {

    // Getters e Setters
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 100)
    private String nome;

    @Column(columnDefinition = "TEXT")
    private String descricao;

    @Column(nullable = false, precision = 10, scale = 2)
    private BigDecimal preco;

    // Construtor padrão obrigatório pro JPA
    public Item() {}

}