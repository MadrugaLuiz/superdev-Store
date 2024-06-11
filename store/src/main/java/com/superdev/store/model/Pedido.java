package com.superdev.store.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Builder
public class Pedido {


    @Id
    @GeneratedValue
    private int id;

    @ManyToOne
    @JoinColumn(name = "cliente_id")
    private Cliente cliente;


    private Date dataTransacao;
    private Double valorTotal;

    @OneToMany
    @JoinTable(

            name = "pedido_produto",
            joinColumns = @JoinColumn(name = "pedido_id"),
            inverseJoinColumns = @JoinColumn(name = "produto_id")
    )
    private List<Produto> produtosPedido;




    @ManyToOne
    @JoinColumn(name = "caixa_id")
    private Caixa caixa;

}
