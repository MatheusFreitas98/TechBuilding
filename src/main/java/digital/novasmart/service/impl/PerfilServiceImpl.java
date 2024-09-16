package digital.novasmart.service.impl;

import digital.novasmart.domain.entity.Perfil;
import digital.novasmart.domain.entity.Pessoa;
import digital.novasmart.domain.repository.PerfilRepository;
import digital.novasmart.rest.dto.PerfilDTO;
import digital.novasmart.rest.dto.PessoaDTO;
import digital.novasmart.service.PerfilService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class PerfilServiceImpl implements PerfilService {

    private PerfilRepository repository;

    public PerfilServiceImpl(PerfilRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<PerfilDTO> listarPerfis() {
        List<Perfil> perfis = repository.findAll();
        return perfis.stream().map(perfil -> new PerfilDTO(perfil)).collect(Collectors.toList());
    }

    @Override
    public PerfilDTO criarPerfil(PerfilDTO perfilDTO) {
        Perfil perfil = new Perfil(perfilDTO.getDescricao());
        perfil = repository.save(perfil);
        return new PerfilDTO(perfil);
    }
}
