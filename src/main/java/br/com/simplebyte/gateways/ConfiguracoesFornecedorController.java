package br.com.simplebyte.gateways;

import br.com.simplebyte.domains.ConfiguracoesFornecedor;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/configuracoes-fornecedor")
@RequiredArgsConstructor
public class ConfiguracoesFornecedorController {

    private final ConfiguracoesFornecedorRepository configuracoesFornecedorRepository;

    @GetMapping
    public List<ConfiguracoesFornecedor> listarTodos() {
        return configuracoesFornecedorRepository.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<ConfiguracoesFornecedor> buscarPorId(@PathVariable String id) {
        ConfiguracoesFornecedor config = configuracoesFornecedorRepository.findById(id).get();
        return ResponseEntity.ok(config);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public ConfiguracoesFornecedor criar(@RequestBody ConfiguracoesFornecedor configuracoesFornecedor) {
        return configuracoesFornecedorRepository.save(configuracoesFornecedor);
    }

    @PutMapping("/{id}")
    public ConfiguracoesFornecedor atualizar(@PathVariable String id, @RequestBody ConfiguracoesFornecedor configuracoesFornecedor) {
        return configuracoesFornecedorRepository.save(configuracoesFornecedor);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deletar(@PathVariable String id) {
        configuracoesFornecedorRepository.deleteById(id);
    }
}
