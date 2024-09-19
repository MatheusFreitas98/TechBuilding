package digital.novasmart.rest.controller;

import digital.novasmart.rest.dto.PessoaDTO;
import digital.novasmart.service.PessoaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/pessoas")
public class PessoaController {

    @Autowired
    private final PessoaService service;

    public PessoaController(PessoaService service) {
        this.service = service;
    }

    @GetMapping("/listar")
    public List<PessoaDTO> listarPessoas() {
        return service.listarPessoas();
    }

    @GetMapping("/listaCompleta")
    public List<PessoaDTO> listarPessoasCompleto() {
        return service.listarPessoas();
    }

    @PostMapping("/adicionarPessoa")
    public ResponseEntity<PessoaDTO> adicionarPessoa(@RequestBody PessoaDTO pessoaDTO) {
        PessoaDTO novaPessoa = service.adicionarPessoa(pessoaDTO);
        return new ResponseEntity<>(novaPessoa, HttpStatus.CREATED);
    }
}
