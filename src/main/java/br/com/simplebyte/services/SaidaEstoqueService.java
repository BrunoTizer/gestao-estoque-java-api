package br.com.simplebyte.services;

import br.com.simplebyte.domains.SaidaEstoque;
import br.com.simplebyte.gateways.SaidaEstoqueRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class SaidaEstoqueService {

    private final SaidaEstoqueRepository saidaEstoqueRepository;

    public List<SaidaEstoque> listarTodos() {
        return saidaEstoqueRepository.findAll();
    }

    public Optional<SaidaEstoque> buscarPorId(String id) {
        return saidaEstoqueRepository.findById(id);
    }

    public SaidaEstoque criar(SaidaEstoque saidaEstoque) {
        return saidaEstoqueRepository.save(saidaEstoque);
    }

    public SaidaEstoque atualizar(SaidaEstoque saidaEstoque) {
        return saidaEstoqueRepository.save(saidaEstoque);
    }

    public void deletar(String id) {
        saidaEstoqueRepository.deleteById(id);
    }
}
