package digital.novasmart.service;

import digital.novasmart.rest.dto.PerfilDTO;

import java.util.List;

public interface PerfilService {
    List<PerfilDTO> listarPerfis();
    PerfilDTO criarPerfil(PerfilDTO perfilDTO);
}
