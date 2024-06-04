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
public class Caixa {

    private int id;
    private boolean status;
    private List<Pedido> pedidos;
    private Date dataFechamento;
    private Double valorTotal;
}
