package br.com.simplebyte.gateways;

import br.com.simplebyte.domains.Marca;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MarcaRepository extends JpaRepository<Marca, String> {
}
