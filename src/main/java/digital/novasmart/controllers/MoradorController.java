package digital.novasmart.controllers;

import digital.novasmart.entities.Pessoa;
import digital.novasmart.repositories.MoradorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/moradores")
public class MoradorController {

    @Autowired
    private MoradorRepository moradorRepository;

    @GetMapping("/listar")
    @ResponseBody
    public ResponseEntity<List<Pessoa>> findAll () {
        List<Pessoa> moradores = moradorRepository.findAll();
        if (!moradores.isEmpty()) {
            return ResponseEntity.ok(moradores);
        }
        return ResponseEntity.notFound().build();
    }

    @PostMapping("/adicionar")
    @ResponseBody
    public Pessoa add(@RequestBody Pessoa pessoa) {
        return moradorRepository.save(pessoa);
    }
}

