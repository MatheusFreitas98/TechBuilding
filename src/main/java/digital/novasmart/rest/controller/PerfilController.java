package digital.novasmart.rest.controller;

import digital.novasmart.rest.dto.PerfilDTO;
import digital.novasmart.service.PerfilService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/perfis")
public class PerfilController {

    @Autowired
    private final PerfilService service;

    public PerfilController(PerfilService service) {
        this.service = service;
    }

    @GetMapping("/listar")
    public List<PerfilDTO> listarPerfis() {
        return service.listarPerfis();
    }

    @PostMapping("/criarPerfil")
    public ResponseEntity<PerfilDTO> criarPerfil(@RequestBody PerfilDTO perfilDTO) {
        PerfilDTO novoPerfil = service.criarPerfil(perfilDTO);
        return new ResponseEntity<>(novoPerfil, HttpStatus.CREATED);
    }
}
