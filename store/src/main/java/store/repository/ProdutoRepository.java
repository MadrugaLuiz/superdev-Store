package store.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import store.model.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Integer> {
}
