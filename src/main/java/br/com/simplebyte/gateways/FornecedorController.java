package br.com.simplebyte.gateways;

import br.com.simplebyte.domains.Fornecedor;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/fornecedores")
@RequiredArgsConstructor
public class FornecedorController {

    private final FornecedorRepository fornecedorRepository;

    @GetMapping
    public List<Fornecedor> listarTodos() {
        return fornecedorRepository.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Fornecedor> buscarPorId(@PathVariable String id) {
        Fornecedor fornecedor = fornecedorRepository.findById(id).get();
        return ResponseEntity.ok(fornecedor);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Fornecedor criar(@RequestBody Fornecedor fornecedor) {
        return fornecedorRepository.save(fornecedor);
    }

    @PutMapping("/{id}")
    public Fornecedor atualizar(@PathVariable String id, @RequestBody Fornecedor fornecedor) {
        return fornecedorRepository.save(fornecedor);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deletar(@PathVariable String id) {
        fornecedorRepository.deleteById(id);
    }
}
