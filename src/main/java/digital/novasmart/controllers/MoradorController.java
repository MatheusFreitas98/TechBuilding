package digital.novasmart.controllers;

import digital.novasmart.entities.Morador;
import digital.novasmart.repositories.MoradorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/moradores")
public class MoradorController {

    @Autowired
    private MoradorRepository moradorRepository;

    @GetMapping("/listar")
    @ResponseBody
    public ResponseEntity<List<Morador>> findAll () {
        List<Morador> moradores = moradorRepository.findAll();
        if (!moradores.isEmpty()) {
            return ResponseEntity.ok(moradores);
        }
        return ResponseEntity.notFound().build();
    }

    @PostMapping("/adicionar")
    @ResponseBody
    public Morador add(@RequestBody Morador morador) {
        return moradorRepository.save(morador);
    }
}

