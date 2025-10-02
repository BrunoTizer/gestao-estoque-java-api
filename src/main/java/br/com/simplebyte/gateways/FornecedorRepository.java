package br.com.simplebyte.gateways;

import br.com.simplebyte.domains.Fornecedor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FornecedorRepository extends JpaRepository<Fornecedor, String> {
}
