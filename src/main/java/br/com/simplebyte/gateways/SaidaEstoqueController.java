package br.com.simplebyte.gateways;

import br.com.simplebyte.domains.SaidaEstoque;
import br.com.simplebyte.services.SaidaEstoqueService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/saida-estoque")
@RequiredArgsConstructor
public class SaidaEstoqueController {

    private final SaidaEstoqueService saidaEstoqueService;

    @GetMapping
    public List<SaidaEstoque> listarTodos() {
        return saidaEstoqueService.listarTodos();
    }

    @GetMapping("/{id}")
    public ResponseEntity<SaidaEstoque> buscarPorId(@PathVariable String id) {
        SaidaEstoque saida = saidaEstoqueService.buscarPorId(id).get();
        return ResponseEntity.ok(saida);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public SaidaEstoque criar(@RequestBody SaidaEstoque saidaEstoque) {
        return saidaEstoqueService.criar(saidaEstoque);
    }
}
