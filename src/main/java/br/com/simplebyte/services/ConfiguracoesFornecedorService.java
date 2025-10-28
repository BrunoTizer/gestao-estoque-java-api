package br.com.simplebyte.services;

import br.com.simplebyte.domains.ConfiguracoesFornecedor;
import br.com.simplebyte.gateways.ConfiguracoesFornecedorRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ConfiguracoesFornecedorService {

    private final ConfiguracoesFornecedorRepository configuracoesFornecedorRepository;

    public List<ConfiguracoesFornecedor> listarTodos() {
        return configuracoesFornecedorRepository.findAll();
    }

    public Optional<ConfiguracoesFornecedor> buscarPorId(String id) {
        return configuracoesFornecedorRepository.findById(id);
    }

    public ConfiguracoesFornecedor criar(ConfiguracoesFornecedor configuracoesFornecedor) {
        return configuracoesFornecedorRepository.save(configuracoesFornecedor);
    }

    public ConfiguracoesFornecedor atualizar(ConfiguracoesFornecedor configuracoesFornecedor) {
        return configuracoesFornecedorRepository.save(configuracoesFornecedor);
    }

    public void deletar(String id) {
        configuracoesFornecedorRepository.deleteById(id);
    }
}
