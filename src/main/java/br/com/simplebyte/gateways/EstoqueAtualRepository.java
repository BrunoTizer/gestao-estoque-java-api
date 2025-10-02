package br.com.simplebyte.gateways;

import br.com.simplebyte.domains.EstoqueAtual;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EstoqueAtualRepository extends JpaRepository<EstoqueAtual, String> {
}
