package digital.novasmart.service;

import digital.novasmart.domain.entity.Apartamento;
import digital.novasmart.rest.dto.ApartamentoDTO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ApartamentoService {
    List<ApartamentoDTO> listarApartamentos();
    ApartamentoDTO cadastrarApartamento(ApartamentoDTO apartamentoDTO);
}
