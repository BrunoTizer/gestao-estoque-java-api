package br.com.simplebyte.gateways;

import br.com.simplebyte.domains.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository<Produto, String> {
}
