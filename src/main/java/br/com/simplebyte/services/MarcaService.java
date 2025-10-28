package br.com.simplebyte.services;

import br.com.simplebyte.domains.Marca;
import br.com.simplebyte.gateways.MarcaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class MarcaService {

    private final MarcaRepository marcaRepository;

    public List<Marca> listarTodos() {
        return marcaRepository.findAll();
    }

    public Optional<Marca> buscarPorId(String id) {
        return marcaRepository.findById(id);
    }

    public Marca criar(Marca marca) {
        return marcaRepository.save(marca);
    }

    public Marca atualizar(Marca marca) {
        return marcaRepository.save(marca);
    }

    public void deletar(String id) {
        marcaRepository.deleteById(id);
    }
}
