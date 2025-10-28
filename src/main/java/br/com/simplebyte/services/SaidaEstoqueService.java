package br.com.simplebyte.services;

import br.com.simplebyte.domains.Produto;
import br.com.simplebyte.domains.SaidaEstoque;
import br.com.simplebyte.gateways.ProdutoRepository;
import br.com.simplebyte.gateways.SaidaEstoqueRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class SaidaEstoqueService {

    private final SaidaEstoqueRepository saidaEstoqueRepository;
    private final ProdutoRepository produtoRepository;

    public List<SaidaEstoque> listarTodos() {
        return saidaEstoqueRepository.findAll();
    }

    public Optional<SaidaEstoque> buscarPorId(String id) {
        return saidaEstoqueRepository.findById(id);
    }

    public SaidaEstoque criar(SaidaEstoque saidaEstoque) {
        String produtoId = saidaEstoque.getProduto().getId();
        Produto produto = produtoRepository.findById(produtoId).get();

        Integer novaQuantidade = produto.getQuantidadeAtual() - saidaEstoque.getQuantidade();
        Produto produtoAtualizado = produto.withQuantidadeAtual(novaQuantidade)
                .withDataUltimaAtualizacao(new Date());

        produtoRepository.save(produtoAtualizado);

        SaidaEstoque saidaComData = saidaEstoque.withDataSaida(new Date());
        return saidaEstoqueRepository.save(saidaComData);
    }

    public SaidaEstoque atualizar(SaidaEstoque saidaEstoque) {
        return saidaEstoqueRepository.save(saidaEstoque);
    }

    public void deletar(String id) {
        saidaEstoqueRepository.deleteById(id);
    }
}
