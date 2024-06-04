package com.superdev.store.model;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
@Entity
@AllArgsConstructor
@Builder
public class Produto {

    //Banco de dados chamado produto será criado por chamar o @Entity

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;


    private String nome;
    private Double preco;
    private int quantidade;

    @ManyToOne
    @JoinColumn(name = "categoria_id")
    private Categoria categoria;


}