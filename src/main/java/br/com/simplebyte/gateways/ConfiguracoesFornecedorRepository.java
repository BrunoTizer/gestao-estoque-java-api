package br.com.simplebyte.gateways;

import br.com.simplebyte.domains.ConfiguracoesFornecedor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ConfiguracoesFornecedorRepository extends JpaRepository<ConfiguracoesFornecedor, String> {
}
