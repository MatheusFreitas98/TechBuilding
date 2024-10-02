package digital.novasmart.service.impl;

import digital.novasmart.domain.entity.Contrato;
import digital.novasmart.domain.repository.ContratoRepository;
import digital.novasmart.rest.dto.ContratoDTO;
import digital.novasmart.service.ContratoService;

import java.util.Set;
import java.util.stream.Collectors;

public class ContratoServiceImpl implements ContratoService {

    private final ContratoRepository repository;

    public ContratoServiceImpl(ContratoRepository repository) {
        this.repository = repository;
    }

    @Override
    public Set<ContratoDTO> listarTodosContratos() {
        return repository.findAll()
                .stream()
                .map(contrato -> new ContratoDTO(contrato)) // Converte para DTO
                .collect(Collectors.toSet()); // Converte o stream em lista
    }

    @Override
    public Contrato salvarContrato(Contrato contrato) {
        return repository.save(contrato);
    }
}
