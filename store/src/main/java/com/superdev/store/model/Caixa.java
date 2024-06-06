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
public class Caixa {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;


    private boolean status;

    @OneToMany(mappedBy = "caixa")
    private List<Pedido> pedidosCaixa;


    private Date dataFechamento;
    private Double valorTotal;
}
