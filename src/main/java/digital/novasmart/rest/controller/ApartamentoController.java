package digital.novasmart.rest.controller;

import digital.novasmart.rest.dto.ApartamentoDTO;
import digital.novasmart.service.ApartamentoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/apartamentos")
public class ApartamentoController {

    @Autowired
    private final ApartamentoService service;

    public ApartamentoController(ApartamentoService service) {
        this.service = service;
    }

    @GetMapping("/listar")
    public List<ApartamentoDTO> listarApartamentos() {
        return service.listarApartamentos();
    }

    @PostMapping("/cadastrar")
    public ResponseEntity<ApartamentoDTO> registrarApartamento(@RequestBody ApartamentoDTO apartamentoDTO) {
        ApartamentoDTO novoApartamento = service.cadastrarApartamento(apartamentoDTO);
        return new ResponseEntity<>(novoApartamento, HttpStatus.CREATED);
    }
}
