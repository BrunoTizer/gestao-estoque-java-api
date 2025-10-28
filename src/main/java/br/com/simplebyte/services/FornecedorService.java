package br.com.simplebyte.services;

import br.com.simplebyte.domains.Fornecedor;
import br.com.simplebyte.gateways.FornecedorRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class FornecedorService {

    private final FornecedorRepository fornecedorRepository;

    public List<Fornecedor> listarTodos() {
        return fornecedorRepository.findAll();
    }

    public Optional<Fornecedor> buscarPorId(String id) {
        return fornecedorRepository.findById(id);
    }

    public Fornecedor criar(Fornecedor fornecedor) {
        return fornecedorRepository.save(fornecedor);
    }

    public Fornecedor atualizar(Fornecedor fornecedor) {
        return fornecedorRepository.save(fornecedor);
    }

    public void deletar(String id) {
        fornecedorRepository.deleteById(id);
    }
}
