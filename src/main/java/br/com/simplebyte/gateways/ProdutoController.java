package br.com.simplebyte.gateways;

import br.com.simplebyte.domains.Produto;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/produtos")
@RequiredArgsConstructor
public class ProdutoController {

    private final ProdutoRepository produtoRepository;

    @GetMapping
    public List<Produto> listarTodos() {
        return produtoRepository.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Produto> buscarPorId(@PathVariable String id) {
        Produto produto = produtoRepository.findById(id).get();
        return ResponseEntity.ok(produto);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Produto criar(@RequestBody Produto produto) {
        return produtoRepository.save(produto);
    }

    @PutMapping("/{id}")
    public Produto atualizar(@PathVariable String id, @RequestBody Produto produto) {
        return produtoRepository.save(produto);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deletar(@PathVariable String id) {
        produtoRepository.deleteById(id);
    }
}
