package com.superdev.store.model;

import jakarta.persistence.Entity;
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

    private int id;
    private Cliente cliente;
    private List<Produto> produtos;
    private Date dataTransacao;
    private Double valorTotal;

}
