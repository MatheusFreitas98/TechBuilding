package digital.novasmart.services.impl;

import digital.novasmart.entities.Pessoa;
import digital.novasmart.repositories.PessoaRepository;
import digital.novasmart.services.PessoaService;
import org.springframework.stereotype.Service;

@Service
public class PessoaServiceImpl implements PessoaService {

    private PessoaRepository pessoaRepository;

    public PessoaServiceImpl(PessoaRepository pessoaRepository) {
        this.pessoaRepository = pessoaRepository;
    }
}
