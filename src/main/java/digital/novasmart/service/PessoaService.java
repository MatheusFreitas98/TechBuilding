package digital.novasmart.service;

import digital.novasmart.rest.dto.PessoaDTO;

import java.util.List;

public interface PessoaService {
    List<PessoaDTO> listarPessoas();
//    PessoaDTO buscarPessoaPorId(Integer id);
    PessoaDTO adicionarPessoa(PessoaDTO pessoaDTO);
//    PessoaDTO atualizarPessoa(Integer id, PessoaDTO pessoaDTO);
//    void deletarPessoa(Integer id);
}
