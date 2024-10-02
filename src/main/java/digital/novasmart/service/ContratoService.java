package digital.novasmart.service;

import digital.novasmart.domain.entity.Contrato;
import digital.novasmart.rest.dto.ContratoDTO;

import java.util.Set;

public interface ContratoService {
    public Set<ContratoDTO> listarTodosContratos();
    public Contrato salvarContrato(Contrato contrato);
}
