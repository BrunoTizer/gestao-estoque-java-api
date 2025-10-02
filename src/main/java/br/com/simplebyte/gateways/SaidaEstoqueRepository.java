package br.com.simplebyte.gateways;

import br.com.simplebyte.domains.SaidaEstoque;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SaidaEstoqueRepository extends JpaRepository<SaidaEstoque, String> {
}
