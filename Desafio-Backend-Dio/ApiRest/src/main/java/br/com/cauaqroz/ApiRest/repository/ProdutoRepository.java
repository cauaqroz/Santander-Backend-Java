package br.com.cauaqroz.ApiRest.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import br.com.cauaqroz.ApiRest.model.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {
}