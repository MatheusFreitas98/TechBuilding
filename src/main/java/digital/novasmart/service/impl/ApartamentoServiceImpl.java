package digital.novasmart.service.impl;

import digital.novasmart.domain.entity.Apartamento;
import digital.novasmart.domain.repository.ApartamentoRepository;
import digital.novasmart.rest.dto.ApartamentoDTO;
import digital.novasmart.service.ApartamentoService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ApartamentoServiceImpl implements ApartamentoService {

    private final ApartamentoRepository repository;

    public ApartamentoServiceImpl(ApartamentoRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<ApartamentoDTO> listarApartamentos() {
        return repository.findAll().stream().map(apartamento -> new ApartamentoDTO(apartamento)).toList();
    }

    @Override
    public ApartamentoDTO cadastrarApartamento(ApartamentoDTO apartamentoDTO) {
        Apartamento apartamento = apartamentoDTO.toEntity();
        apartamento = repository.save(apartamento);
        return new ApartamentoDTO(apartamento);
    }
}
