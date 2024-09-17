package digital.novasmart.service;

import digital.novasmart.rest.dto.PessoaDTO;

import java.util.List;

public interface PessoaService {
    List<PessoaDTO> listarPessoas();
    PessoaDTO adicionarPessoa(PessoaDTO pessoaDTO);
}
