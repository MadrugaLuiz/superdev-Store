package com.superdev.store.repository;

import com.superdev.store.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ProdutoRepository extends JpaRepository<Produto, Integer> {
    //Exemplo de Select no padrão JPQL

    @Query("SELECT p FROM Produto  p Where p.nome ILIKE %:NOME%")
    List<Produto> buscarProdutoPorNome(@Param("NOME") String nome);
}

