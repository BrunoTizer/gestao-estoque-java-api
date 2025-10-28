package br.com.simplebyte.gateways;

import br.com.simplebyte.domains.EstoqueAtual;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/estoque-atual")
@RequiredArgsConstructor
public class EstoqueAtualController {

    private final EstoqueAtualRepository estoqueAtualRepository;

    @GetMapping
    public List<EstoqueAtual> listarTodos() {
        return estoqueAtualRepository.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<EstoqueAtual> buscarPorId(@PathVariable String id) {
        EstoqueAtual estoque = estoqueAtualRepository.findById(id).get();
        return ResponseEntity.ok(estoque);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public EstoqueAtual criar(@RequestBody EstoqueAtual estoqueAtual) {
        return estoqueAtualRepository.save(estoqueAtual);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deletar(@PathVariable String id) {
        estoqueAtualRepository.deleteById(id);
    }
}
