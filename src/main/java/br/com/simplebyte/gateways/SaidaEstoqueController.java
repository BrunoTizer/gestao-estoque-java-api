package br.com.simplebyte.gateways;

import br.com.simplebyte.domains.SaidaEstoque;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/saida-estoque")
@RequiredArgsConstructor
public class SaidaEstoqueController {

    private final SaidaEstoqueRepository saidaEstoqueRepository;

    @GetMapping
    public List<SaidaEstoque> listarTodos() {
        return saidaEstoqueRepository.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<SaidaEstoque> buscarPorId(@PathVariable String id) {
        SaidaEstoque saida = saidaEstoqueRepository.findById(id).get();
        return ResponseEntity.ok(saida);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public SaidaEstoque criar(@RequestBody SaidaEstoque saidaEstoque) {
        return saidaEstoqueRepository.save(saidaEstoque);
    }
}
