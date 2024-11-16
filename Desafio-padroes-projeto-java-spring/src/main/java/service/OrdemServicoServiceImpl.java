package service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import model.OrdemServico;
import repository.OrdemServicoRepository;

@Service
public class OrdemServicoServiceImpl implements OrdemServicoService {

    @Autowired
    private OrdemServicoRepository ordemServicoRepository;

    @Override
    public Iterable<OrdemServico> buscarTodos() {
        return ordemServicoRepository.findAll();
    }

    @Override
    public OrdemServico buscarPorId(Long id) {
        return ordemServicoRepository.findById(id).orElseThrow(() -> new RuntimeException("Ordem de serviço não encontrada"));
    }

    @Override
    public void inserir(OrdemServico ordemServico) {
        ordemServicoRepository.save(ordemServico);
    }

    @Override
    public void atualizar(Long id, OrdemServico ordemServico) {
        if (ordemServicoRepository.existsById(id)) {
            ordemServico.setId(id);
            ordemServicoRepository.save(ordemServico);
        }
    }

    @Override
    public void deletar(Long id) {
        ordemServicoRepository.deleteById(id);
    }
}
