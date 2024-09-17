package digital.novasmart.service.impl;

import digital.novasmart.domain.entity.Perfil;
import digital.novasmart.domain.entity.PerfilPessoa;
import digital.novasmart.domain.entity.Pessoa;
import digital.novasmart.domain.repository.PerfilPessoaRepository;
import digital.novasmart.domain.repository.PerfilRepository;
import digital.novasmart.rest.dto.PerfilPessoaDTO;
import digital.novasmart.service.PerfilPessoaService;
import org.springframework.stereotype.Service;

@Service
public class PerfilPessoaServiceImpl implements PerfilPessoaService {

    private PerfilPessoaRepository repository;

    public PerfilPessoaServiceImpl(PerfilPessoaRepository repository) {
        this.repository = repository;
    }

    @Override
    public PerfilPessoaDTO atribuirPerfilPessoa(PerfilPessoaDTO perfilPessoaDTO) {
        PerfilPessoa perfilPessoa = new PerfilPessoa(perfilPessoaDTO.getPerfil_id(), perfilPessoaDTO.getPessoa_id());
        perfilPessoa = repository.save(perfilPessoa);
        return new PerfilPessoaDTO(perfilPessoa.getPerfil_id(), perfilPessoa.getPessoa_id());
    }

}
