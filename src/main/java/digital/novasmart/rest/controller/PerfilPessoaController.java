package digital.novasmart.rest.controller;

import digital.novasmart.rest.dto.PerfilPessoaDTO;
import digital.novasmart.rest.dto.PessoaDTO;
import digital.novasmart.service.PerfilPessoaService;
import digital.novasmart.service.PerfilService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/perfilPessoa")
public class PerfilPessoaController {

    @Autowired
    private final PerfilPessoaService service;

    public PerfilPessoaController(PerfilPessoaService service) {
        this.service = service;
    }

    @PostMapping("/atribuirPerfil")
    public ResponseEntity<PerfilPessoaDTO> atribuirPerfilPessoa(@RequestBody PerfilPessoaDTO perfilPessoaDTO) {
        PerfilPessoaDTO perfilPessoa = service.atribuirPerfilPessoa(perfilPessoaDTO);
        return new ResponseEntity<>(perfilPessoa, HttpStatus.CREATED);
    }

}
