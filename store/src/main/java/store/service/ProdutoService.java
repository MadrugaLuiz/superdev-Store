package store.service;


import org.springframework.beans.factory.annotation.Autowired;
import store.model.Produto;
import store.repository.ProdutoRepository;

import java.util.List;

public class ProdutoService {


    @Autowired
    private ProdutoRepository produtoRepository;

    public List<Produto> findAll(){
        return produtoRepository.findAll();
    }

    public Produto findById(int id) {

        return produtoRepository.findById(id).orElse(null);
    }
    public Produto save(Produto produto) {

        return produtoRepository.save(produto);
    }

    public void delete (Produto produto){

        produtoRepository.delete(produto);
    }



}
