package br.com.simplebyte.services;

import br.com.simplebyte.domains.Produto;
import br.com.simplebyte.gateways.ProdutoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ProdutoService {

    private final ProdutoRepository produtoRepository;

    public List<Produto> listarTodos() {
        return produtoRepository.findAll();
    }

    public Optional<Produto> buscarPorId(String id) {
        return produtoRepository.findById(id);
    }

    public Produto criar(Produto produto) {
        return produtoRepository.save(produto);
    }

    public Produto atualizar(Produto produto) {
        return produtoRepository.save(produto);
    }

    public void deletar(String id) {
        produtoRepository.deleteById(id);
    }
}
