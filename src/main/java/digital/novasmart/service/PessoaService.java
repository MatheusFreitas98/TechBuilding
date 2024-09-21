package digital.novasmart.service;

//import digital.novasmart.rest.dto.PessoaCompletaDTO;
import digital.novasmart.rest.dto.PessoaDTO;

import java.util.List;

public interface PessoaService {
    List<PessoaDTO> listarPessoas();
//    List<PessoaCompletaDTO> listaCompleta();
    PessoaDTO adicionarPessoa(PessoaDTO pessoaDTO);
}
