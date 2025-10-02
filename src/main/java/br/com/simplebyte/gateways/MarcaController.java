package br.com.simplebyte.gateways;

import br.com.simplebyte.domains.Marca;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/marcas")
@RequiredArgsConstructor
public class MarcaController {

    private final MarcaRepository marcaRepository;

    @GetMapping
    public List<Marca> listarTodos() {
        return marcaRepository.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Marca> buscarPorId(@PathVariable String id) {
        Marca marca = marcaRepository.findById(id).get();
        return ResponseEntity.ok(marca);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Marca criar(@RequestBody Marca marca) {
        return marcaRepository.save(marca);
    }

    @PutMapping("/{id}")
    public Marca atualizar(@PathVariable String id, @RequestBody Marca marca) {
        return marcaRepository.save(marca);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deletar(@PathVariable String id) {
        marcaRepository.deleteById(id);
    }
}
