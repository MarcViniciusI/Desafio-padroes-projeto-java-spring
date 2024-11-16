package service;

import model.OrdemServico;

public interface OrdemServicoService {

    Iterable<OrdemServico> buscarTodos();

    OrdemServico buscarPorId(Long id);

    void inserir(OrdemServico ordemServico);

    void atualizar(Long id, OrdemServico ordemServico);

    void deletar(Long id);
}
