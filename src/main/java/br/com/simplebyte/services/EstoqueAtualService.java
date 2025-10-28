package br.com.simplebyte.services;

import br.com.simplebyte.domains.EstoqueAtual;
import br.com.simplebyte.gateways.EstoqueAtualRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class EstoqueAtualService {

    private final EstoqueAtualRepository estoqueAtualRepository;

    public List<EstoqueAtual> listarTodos() {
        return estoqueAtualRepository.findAll();
    }

    public Optional<EstoqueAtual> buscarPorId(String id) {
        return estoqueAtualRepository.findById(id);
    }

    public EstoqueAtual criar(EstoqueAtual estoqueAtual) {
        return estoqueAtualRepository.save(estoqueAtual);
    }

    public EstoqueAtual atualizar(EstoqueAtual estoqueAtual) {
        return estoqueAtualRepository.save(estoqueAtual);
    }

    public void deletar(String id) {
        estoqueAtualRepository.deleteById(id);
    }
}
