package digital.novasmart.service;

import digital.novasmart.rest.dto.ApartamentoDTO;

import java.util.List;

public interface ApartamentoService {
    List<ApartamentoDTO> listarApartamentos();
    ApartamentoDTO cadastrarApartamento(ApartamentoDTO apartamentoDTO);
}
