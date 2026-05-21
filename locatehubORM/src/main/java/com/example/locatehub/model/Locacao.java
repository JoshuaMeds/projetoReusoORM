package com.example.locatehub.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Setter
@Getter
@Entity
@Table(name = "tb_locacao")
public class Locacao {

    // Getters e Setters
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // Mapeamento correto do ORM: Cria a FK (chave estrangeira) para a tabela de itens
    @ManyToOne
    @JoinColumn(name = "item_id", nullable = false)
    private Item item;

    // Se não tiver uma classe Usuario criada ainda, guardamos apenas o número do ID:
    @Column(name = "usuario_id", nullable = false)
    private Long usuarioId;

    @Column(nullable = false)
    private LocalDate dataInicio;

    @Column(nullable = false)
    private LocalDate dataFim;

    // Construtor padrão
    public Locacao() {}

}