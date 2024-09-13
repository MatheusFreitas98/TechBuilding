package digital.novasmart.service.impl;

import digital.novasmart.domain.entity.Pessoa;
import digital.novasmart.domain.repository.PessoaRepository;
import digital.novasmart.rest.dto.PessoaDTO;
import digital.novasmart.service.PessoaService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class PessoaServiceImpl implements PessoaService {

    private final PessoaRepository repository;

    public PessoaServiceImpl(PessoaRepository pessoaRepository) {
        this.repository = pessoaRepository;
    }

    @Override
    public List<PessoaDTO> listarPessoas() {
        List<Pessoa> pessoas = repository.findAll();
        return pessoas.stream().map(pessoa -> new PessoaDTO(pessoa)).collect(Collectors.toList());
    }

    @Override
    public PessoaDTO adicionarPessoa(PessoaDTO pessoaDTO) {
        Pessoa pessoa = new Pessoa(pessoaDTO.getNome(), pessoaDTO.getSobrenome(), pessoaDTO.getTelefone(), pessoaDTO.getDocumento());
        pessoa = repository.save(pessoa);
        return new PessoaDTO(pessoa);
    }

}
